package com.odbpo.fenggo.dagger_demo.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.odbpo.fenggo.dagger_demo.R;
import com.odbpo.fenggo.dagger_demo.bean.TestBean;
import com.odbpo.fenggo.dagger_demo.bean.TestBean2;
import com.odbpo.fenggo.dagger_demo.di.component.DaggerMainComponent;
import com.odbpo.fenggo.dagger_demo.di.module.MainModule;
import com.odbpo.fenggo.dagger_demo.di.module.PersonalModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    TestBean testBean;

    @Inject
    TestBean2 testBean2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        injectObject();
        show();
    }

    private void show() {
        Toast.makeText(this,testBean.getContent() + "\n" + testBean2.getName(),Toast.LENGTH_SHORT).show();
    }

    private void injectObject() {
        DaggerMainComponent.builder()
                .mainModule(new MainModule())
                .personalModule(new PersonalModule())
                .build()
                .inject(this);
    }

    public void gotoMain2Activity(View view){
        startActivity(new Intent(this,Main2Activity.class));
    }

}

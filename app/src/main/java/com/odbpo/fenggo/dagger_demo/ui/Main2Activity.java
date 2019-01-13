package com.odbpo.fenggo.dagger_demo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.odbpo.fenggo.dagger_demo.R;
import com.odbpo.fenggo.dagger_demo.bean.TestBean2;
import com.odbpo.fenggo.dagger_demo.di.component.DaggerMainComponent;
import com.odbpo.fenggo.dagger_demo.di.module.MainModule;
import com.odbpo.fenggo.dagger_demo.di.module.PersonalModule;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {

    @Inject
    TestBean2 testBean2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        injectObject();
        show();
    }

    private void show() {
        Toast.makeText(this,testBean2.getName(),Toast.LENGTH_SHORT).show();
    }

    private void injectObject() {
        DaggerMainComponent.builder()
                .personalModule(new PersonalModule())
                .build()
                .inject(this);
    }
}

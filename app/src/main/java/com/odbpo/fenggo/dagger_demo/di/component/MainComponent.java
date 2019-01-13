package com.odbpo.fenggo.dagger_demo.di.component;

import com.odbpo.fenggo.dagger_demo.ui.Main2Activity;
import com.odbpo.fenggo.dagger_demo.ui.MainActivity;
import com.odbpo.fenggo.dagger_demo.di.module.MainModule;
import com.odbpo.fenggo.dagger_demo.di.module.PersonalModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MainModule.class,PersonalModule.class})
public interface MainComponent {

    //将MainModule中提供的对象注入到MainActivity中使用
    void inject(MainActivity activity);

    void inject(Main2Activity activity);

}

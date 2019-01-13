package com.odbpo.fenggo.dagger_demo.di.module;

import com.odbpo.fenggo.dagger_demo.bean.TestBean2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PersonalModule {

    @Singleton
    @Provides
    public TestBean2 provideTestBean2(){
        return new TestBean2();
    }

}

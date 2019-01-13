package com.odbpo.fenggo.dagger_demo.di.module;

import com.odbpo.fenggo.dagger_demo.bean.TestBean;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    //单例（Module使用单例，其对应的Component也要使用单例）
    @Singleton
    //提供TestBean对象
    @Provides
    public TestBean provideTestBean(){
        return new TestBean();
    }

}

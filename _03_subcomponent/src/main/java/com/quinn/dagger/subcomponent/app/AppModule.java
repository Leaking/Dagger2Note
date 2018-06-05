package com.quinn.dagger.subcomponent.app;

import com.quinn.dagger.subcomponent.base.CommonBean;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    public AppBean provideAppBean() {
        return new AppBean("appBean");
    }


    @Provides
    public CommonBean provideCommonBean() {
        return new CommonBean("commonBean");
    }



}

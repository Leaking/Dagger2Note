package com.quinn.dagger.subcomponent.business;

import com.quinn.dagger.subcomponent.base.CommonBean;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    public MainBean provideMainModule(CommonBean commonBean) {
        return new MainBean("main module", commonBean);
    }

}

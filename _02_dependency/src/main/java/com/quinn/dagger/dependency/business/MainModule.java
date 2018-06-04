package com.quinn.dagger.dependency.business;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {


    @Provides
    public MainBean provideMainModule() {
        return new MainBean("main module");
    }


}

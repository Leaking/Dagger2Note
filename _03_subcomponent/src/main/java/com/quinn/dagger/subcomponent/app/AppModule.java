package com.quinn.dagger.subcomponent.app;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    public AppBean provideAppBean() {
        return new AppBean("appBean");
    }

}

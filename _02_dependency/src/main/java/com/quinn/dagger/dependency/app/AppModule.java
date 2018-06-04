package com.quinn.dagger.dependency.app;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    public AppBean provideAppBean() {
        return new AppBean("appBean");
    }

}

package com.quinn.dagger.subcomponent.app;

import android.content.Context;

import com.quinn.dagger.subcomponent.base.CommonBean;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }


    @AppScope
    @Provides
    public AppBean provideAppBean() {
        return new AppBean("appBean");
    }

    @AppScope
    @Provides
    public CommonBean provideCommonBean() {
        return new CommonBean("commonBean");
    }



}

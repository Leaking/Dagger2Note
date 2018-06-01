package com.quinn.dagger.daggerandroid;

import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class AppModule {


    @Provides
    public static SharedPreferences getSp(Context context) {
        return context.getSharedPreferences("app_sp", Context.MODE_PRIVATE);
    }


}

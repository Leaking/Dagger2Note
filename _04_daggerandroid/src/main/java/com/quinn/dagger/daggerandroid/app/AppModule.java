package com.quinn.dagger.daggerandroid.app;

import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Context context;

    public AppModule(Context context){
        this.context = context;
    }

    @Provides
    public SharedPreferences getSp() {
        return context.getSharedPreferences("app_sp", Context.MODE_PRIVATE);
    }




}

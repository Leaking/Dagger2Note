package com.quinn.dagger.subcomponent.app;

import android.app.Application;
import android.util.Log;

import com.quinn.dagger.subcomponent.base.CommonBean;

import javax.inject.Inject;

public class App extends Application {

    public static final String TAG = "App";

    @Inject
    AppBean appBean;

    @Inject
    CommonBean commonBean;

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        this.appComponent.inject(this);
        Log.i(TAG, "appBean " + appBean);
        Log.i(TAG, "commonBean " + commonBean);

    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}

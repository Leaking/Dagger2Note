package com.quinn.dagger.dependency.app;

import android.app.Application;
import android.util.Log;

import javax.inject.Inject;

public class App extends Application {

    public static final String TAG = "App";

    @Inject
    AppBean appBean;

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
        appComponent.inject(this);
        Log.i(TAG, "appBean " + appBean);
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}

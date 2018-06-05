package com.quinn.dagger.subcomponent.app;

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
        Log.i(TAG, "appBean " + appBean);
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}

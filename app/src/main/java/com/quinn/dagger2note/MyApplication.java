package com.quinn.dagger2note;

import android.app.Application;
import android.content.SharedPreferences;
import android.location.LocationManager;
import android.util.Log;

import com.quinn.dagger2note.lesson2.chapter3.SingletonComponent;
import com.quinn.dagger2note.lesson4.ParentComponent;
import com.quinn.dagger2note.lesson4.DaggerParentComponent;
import com.quinn.dagger2note.lesson4.ParentModule;

import javax.inject.Inject;

//import com.quinn.dagger2note.lesson2.chapter3.DaggerSingletonComponent;

public class MyApplication extends Application{

    public static final String TAG = "MyApplication";

    @Inject
    public SharedPreferences sharedPreferences;

    public LocationManager locationManager;

    private SingletonComponent singletonComponent;

    private ParentComponent parentComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        parentComponent = DaggerParentComponent.builder().parentModule(new ParentModule(this)).build();
        parentComponent.inject(this);
        Log.i(TAG, "sp " + sharedPreferences);
//        singletonComponent = DaggerSingletonComponent.create();

    }

    public SingletonComponent getSingletonComponent() {
        return singletonComponent;
    }

    public ParentComponent getParentComponent() {
        return parentComponent;
    }
}

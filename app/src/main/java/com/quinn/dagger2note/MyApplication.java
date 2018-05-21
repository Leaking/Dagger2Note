package com.quinn.dagger2note;

import android.app.Application;

//import com.quinn.dagger2note.lesson2.chapter3.DaggerSingletonComponent;
import com.quinn.dagger2note.lesson2.chapter3.SingletonComponent;

public class MyApplication extends Application{

    private SingletonComponent singletonComponent;

    @Override
    public void onCreate() {
        super.onCreate();

//        singletonComponent = DaggerSingletonComponent.create();
    }

    public SingletonComponent getSingletonComponent() {
        return singletonComponent;
    }
}

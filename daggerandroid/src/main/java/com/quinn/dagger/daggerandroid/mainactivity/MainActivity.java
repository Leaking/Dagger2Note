package com.quinn.dagger.daggerandroid.mainactivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import com.quinn.dagger.daggerandroid.BaseActivity;
import com.quinn.dagger.daggerandroid.R;

import javax.inject.Inject;

import dagger.Component;

public class MainActivity extends BaseActivity {

    public static final String TAG = "MainActivity";

    @Inject
    MainBean mainBean;

    @Inject
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "mainBean " + mainBean);
        Log.i(TAG, "sharedPreferences " + sharedPreferences);
    }
}

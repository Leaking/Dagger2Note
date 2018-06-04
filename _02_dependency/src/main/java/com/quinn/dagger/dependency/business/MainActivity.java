package com.quinn.dagger.dependency.business;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.quinn.dagger.dependency.R;
import com.quinn.dagger.dependency.app.App;
import com.quinn.dagger.dependency.app.AppBean;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    AppBean appBean;

    @Inject
    MainBean mainBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder().appComponent(((App)getApplication()).getAppComponent()).build().inject(this);

        Log.i(TAG, "appBean " + appBean);
        Log.i(TAG, "mainBean " + mainBean);
    }
}

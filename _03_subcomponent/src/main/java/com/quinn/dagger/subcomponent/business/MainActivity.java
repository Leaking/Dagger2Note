package com.quinn.dagger.subcomponent.business;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.quinn.dagger.subcomponent.R;
import com.quinn.dagger.subcomponent.app.App;
import com.quinn.dagger.subcomponent.app.AppBean;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Inject
    MainBean mainBean;

    @Inject
    AppBean appBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App)getApplication()).getAppComponent().plus(new MainModule()).inject(this);
        Log.i(TAG, "appBean " + appBean);
        Log.i(TAG, "mainBean " + mainBean);
    }
}

package com.quinn.dagger2note.lesson2.chapter2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.quinn.dagger2note.R;

import javax.inject.Inject;
import javax.inject.Named;

public class WarActivity extends AppCompatActivity {

    public static final String TAG = "WarActivity";


    @Inject
    public Army zero;

    @Inject
    @Named("blue")
    public Army first;

    @Inject
    @Named("red")
    public Army second;

    @Inject
    @DarkQualifier
    public Army three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
        setContentView(R.layout.activity_war);

        DaggerArmyActivityComponent.create().inject(this);

        Log.i(TAG, "zero " + zero);
        Log.i(TAG, "first " + first);
        Log.i(TAG, "second " + second);
        Log.i(TAG, "three " + three);


    }
}

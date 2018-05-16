package com.quinn.dagger2note.lesson1.chapter1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.quinn.dagger2note.R;

import javax.inject.Inject;

public class UserActivity extends AppCompatActivity {

    private final static String TAG = "UserActivity";

    @Inject
    Folder folder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
        setContentView(R.layout.activity_factory);

        DaggerUserActivityComponent.create().inject(this);
        Log.i(TAG, "" + folder);
    }
}

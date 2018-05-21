package com.quinn.dagger2note.lesson2.chapter3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.quinn.dagger2note.MyApplication;
import com.quinn.dagger2note.R;
import com.quinn.dagger2note.lesson1.chapter1.Folder;

import javax.inject.Inject;

public class SingletonEntryActivity extends AppCompatActivity {

    public static final String TAG = "SingletonEntryActivity";

    @Inject
    public SingletonEntity singletonEntityA;

    @Inject
    public SingletonEntity singletonEntityB;


    @Inject
    public Folder folderA;

    @Inject
    public Folder folderB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_entry);

        SingletonComponent singletonComponent = ((MyApplication)getApplicationContext()).getSingletonComponent();
        singletonComponent.inject(this);

        Log.i(TAG, "singletonEntityA " + singletonEntityA);
        Log.i(TAG, "singletonEntityB " + singletonEntityB);


    }
}

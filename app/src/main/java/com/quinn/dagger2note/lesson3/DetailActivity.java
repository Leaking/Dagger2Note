package com.quinn.dagger2note.lesson3;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.quinn.dagger2note.R;

import javax.inject.Inject;

public class DetailActivity extends AppCompatActivity {

    public static final String TAG = "DetailActivity";

    @Inject
    public SharedPreferences sharedPreferences;

    @Inject
    public Child father;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


//        ParentComponent parentComponent = ((MyApplication)getApplication()).getParentComponent();
//        DaggerChildComponent.builder().parentComponent(parentComponent).build().inject(this);


        Log.i(TAG, "sp " + sharedPreferences);
        Log.i(TAG, "father " + father);

    }
}

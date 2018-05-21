package com.quinn.dagger2note.lesson1.chapter2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.quinn.dagger2note.R;

import javax.inject.Inject;

public class UserActivity extends AppCompatActivity {

    @Inject
    public Folder folder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

    }
}

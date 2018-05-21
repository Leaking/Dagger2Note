package com.quinn.dagger2note.lesson2.chapter1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.quinn.dagger2note.R;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

public class HttpActivity extends AppCompatActivity {

    @Inject
    OkHttpClient okHttpClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http);

        DaggerHttpActivityComponent.create().inject(this);


        Toast.makeText(this, "" + okHttpClient.hashCode(), Toast.LENGTH_SHORT).show();

    }


}

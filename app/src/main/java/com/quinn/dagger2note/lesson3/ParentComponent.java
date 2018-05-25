package com.quinn.dagger2note.lesson3;

import android.content.SharedPreferences;

import com.quinn.dagger2note.MyApplication;

import dagger.Component;

@Component(modules = ParentModule.class)
public interface ParentComponent {

    void inject(MyApplication myApplication);

    SharedPreferences getSp();
}

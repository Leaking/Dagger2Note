package com.quinn.dagger2note.lesson2.chapter1;

import dagger.Component;
import okhttp3.OkHttpClient;

@Component(modules = HttpActivityModule.class)
public interface HttpActivityComponent {


    void inject(HttpActivity httpActivity);

    OkHttpClient get();
}

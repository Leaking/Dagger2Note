package com.quinn.dagger2note.lesson2.chapter1;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

@Module
public class HttpActivityModule {

    @Provides
    OkHttpClient provideOkHttpClient() {
        a = 5;
        return new OkHttpClient();
    }

    int a = 3;

    public void call() {
        a = 4;
    }


}

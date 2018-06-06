package com.quinn.dagger.basic;


import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    public MainPresenter provideMainPresenter(HttpUtils httpUtils) {
        return new MainPresenter(httpUtils);
    }

    @Provides
    public HttpUtils provideHttpUtils(){
        return new HttpUtils();
    }

}

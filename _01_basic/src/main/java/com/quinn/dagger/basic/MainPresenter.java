package com.quinn.dagger.basic;

public class MainPresenter {

    private HttpUtils httpUtils;

    public MainPresenter(HttpUtils httpUtils) {
        this.httpUtils = httpUtils;
    }

    public void start(){
        this.httpUtils.request();
    }

}

package com.quinn.dagger.daggerandroid.mainactivity;

public class MainBean {

    private String text;

    public MainBean(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MainBean{" +
                "text='" + text + '\'' +
                '}';
    }
}

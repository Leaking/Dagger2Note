package com.quinn.dagger.subcomponent.app;

public class AppBean {

    private String name;

    public AppBean(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AppBean{" +
                "name='" + name + '\'' +
                '}';
    }
}

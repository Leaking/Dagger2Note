package com.quinn.dagger.dependency.business;

public class MainBean {

    private String name;

    public MainBean(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MainBean{" +
                "name='" + name + '\'' +
                '}';
    }
}

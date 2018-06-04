package com.quinn.dagger.dependency.business;

import com.quinn.dagger.dependency.app.AppComponent;

import dagger.Component;

@Component(modules = MainModule.class, dependencies = AppComponent.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);

}

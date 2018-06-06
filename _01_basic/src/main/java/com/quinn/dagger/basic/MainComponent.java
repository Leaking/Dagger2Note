package com.quinn.dagger.basic;

import dagger.Component;

@Component(modules = MainModule.class)
public interface MainComponent {

    public void inject(MainActivity mainActivity);

    MainPresenter mainPresenter();

}

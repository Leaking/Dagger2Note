package com.quinn.dagger.subcomponent.business;

import dagger.Subcomponent;

@Subcomponent(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);

}

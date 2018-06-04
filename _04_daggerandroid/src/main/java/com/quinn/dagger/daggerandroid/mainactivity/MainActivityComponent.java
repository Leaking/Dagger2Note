package com.quinn.dagger.daggerandroid.mainactivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {AndroidInjectionModule.class})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {


    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity>{
    }



}

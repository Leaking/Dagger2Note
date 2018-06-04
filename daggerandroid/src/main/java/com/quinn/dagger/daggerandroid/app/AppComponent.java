package com.quinn.dagger.daggerandroid.app;

import com.quinn.dagger.daggerandroid.mainactivity.MainModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, AppModule.class, MainModule.class})
public interface AppComponent {

    public void inject(App app);

}

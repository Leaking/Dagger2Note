package com.quinn.dagger.daggerandroid;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, AppModule.class})
public interface AppComponent {

    public void inject(App app);

}

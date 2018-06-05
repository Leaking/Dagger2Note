package com.quinn.dagger.subcomponent.app;


import com.quinn.dagger.subcomponent.app.AppModule;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(App app);

    AppBean getAppBean();

}

package com.quinn.dagger.dependency.app;


import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(App app);

    AppBean getAppBean();

}

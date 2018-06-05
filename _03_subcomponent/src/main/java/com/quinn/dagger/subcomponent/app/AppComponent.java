package com.quinn.dagger.subcomponent.app;


import com.quinn.dagger.subcomponent.business.MainComponent;
import com.quinn.dagger.subcomponent.business.MainModule;

import dagger.Component;

@AppScope
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(App app);


    MainComponent plus(MainModule mainModule);

}

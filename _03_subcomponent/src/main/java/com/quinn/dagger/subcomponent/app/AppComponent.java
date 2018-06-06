package com.quinn.dagger.subcomponent.app;


import com.quinn.dagger.subcomponent.business.MainComponent;
import com.quinn.dagger.subcomponent.business.MainModule;

import dagger.Component;

@AppScope
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(App app);


    /**
     * subComponent的使用有两种方式，这两种方式其实是一样的
     *
     * 1、通过以下plus这种直接返回subComponent的方式，这个方法可以传入参数，一般参数都是module
     * 2、通过SubComponent.Builder的方式，而builder里我们可以添加传入参数的方法，一般参数也是module
     * 上面两种方法实现的效果是一样的
     *
     */
    MainComponent plus(MainModule mainModule);

//    MainComponent.Builder mainComponentBuilder();

}

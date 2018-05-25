package com.quinn.dagger2note.lesson4;

import com.quinn.dagger2note.MyApplication;

import dagger.Component;

@Component(modules = ParentModule.class)
public interface ParentComponent {

    void inject(MyApplication myApplication);


    ChildComponent.Builder childComponent();
}

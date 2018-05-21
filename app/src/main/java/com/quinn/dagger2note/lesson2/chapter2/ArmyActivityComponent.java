package com.quinn.dagger2note.lesson2.chapter2;

import dagger.Component;

@Component(modules = {ArmyModule.class})
public interface ArmyActivityComponent {

    void inject(WarActivity warActivity);

}

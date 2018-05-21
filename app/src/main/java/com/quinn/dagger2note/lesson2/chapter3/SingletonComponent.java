package com.quinn.dagger2note.lesson2.chapter3;


import dagger.Component;

@Component(modules = SingletonEntiryModule.class)
@PerActivity
public interface SingletonComponent {

    public void inject(SingletonEntryActivity singletonEntryActivity);

}

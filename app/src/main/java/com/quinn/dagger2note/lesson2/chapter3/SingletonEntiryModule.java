package com.quinn.dagger2note.lesson2.chapter3;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SingletonEntiryModule {


    @Provides
    @Singleton
    SingletonEntity getSingletonEntry(){
        return new SingletonEntity("single");
    }


}

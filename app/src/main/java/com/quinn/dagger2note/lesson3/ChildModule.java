package com.quinn.dagger2note.lesson3;


import dagger.Module;
import dagger.Provides;

@Module
public class ChildModule {


    @Provides
    public Child get(){
        return new Child("MaBaba");
    }

}

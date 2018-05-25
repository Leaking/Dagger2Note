package com.quinn.dagger2note.lesson4;


import dagger.Module;
import dagger.Provides;

@Module
public class ChildModule {


    @Provides
    public Child get(){
        return new Child("MaBaba");
    }

}

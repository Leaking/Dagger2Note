package com.quinn.dagger2note.lesson2.chapter2;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ArmyModule {


    @Provides
    Army getDefaultArmy(){
        return new Army("default");
    }

    @Provides
    @Named("red")
    Army getRedArmy(){
        return new Army("red");
    }

    @Provides
    @Named("blue")
    Army getBlueArmy(){
        return new Army("blue");
    }

    @Provides
    @DarkQualifier
    Army getDarkArmy(){
        return new Army("dark");
    }

}

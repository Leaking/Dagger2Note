package com.quinn.dagger2note.lesson4;

import javax.inject.Inject;

public class Child {

    public String name;

    @Inject
    public Child(String name){
        this.name = name;
    }

}

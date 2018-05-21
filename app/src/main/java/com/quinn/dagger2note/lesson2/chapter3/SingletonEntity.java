package com.quinn.dagger2note.lesson2.chapter3;

import javax.inject.Inject;

public class SingletonEntity {

    private String desc;

    @Inject
    public SingletonEntity(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}

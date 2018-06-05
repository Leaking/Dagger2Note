package com.quinn.dagger.subcomponent.business;

import com.quinn.dagger.subcomponent.base.CommonBean;

public class MainBean {

    private String name;

    private CommonBean commonBean;

    public MainBean(String name, CommonBean commonBean) {
        this.name = name;
        this.commonBean = commonBean;
    }

}

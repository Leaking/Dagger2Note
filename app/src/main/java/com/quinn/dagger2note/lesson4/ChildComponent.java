package com.quinn.dagger2note.lesson4;

import dagger.Subcomponent;


/**
 * component的关系分两种，一种是依赖，一种是继承
 *
 * 依赖型关系
 *
 * A从B获取依赖，我们暂且将A称为master， B称为slaver
 * slaver需要把提供的依赖暴露出来（表现方式是，在component中提供一个返回依赖类型的方法）
 *
 * 而master需要在component中声明添加依赖就行
 *
 * 而生成的代码里，是通过将slaver-component实现传入了master-component，从而获取刀slaver提供的依赖
 *
 */
@Subcomponent(modules = ChildModule.class)
public interface ChildComponent {

    void inject(DetailActivity detailActivity);

    @Subcomponent.Builder
    interface Builder { // SubComponent 必须显式地声明 Subcomponent.Builder，parent Component 需要用 Builder 来创建 SubComponent
        ChildComponent build();
    }
}

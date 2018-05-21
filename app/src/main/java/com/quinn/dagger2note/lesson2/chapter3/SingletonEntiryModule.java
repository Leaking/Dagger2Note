package com.quinn.dagger2note.lesson2.chapter3;

import com.quinn.dagger2note.lesson1.chapter1.Folder;

import dagger.Module;
import dagger.Provides;

@Module
public class SingletonEntiryModule {


    @Provides
    @PerActivity //通过一个DoubleCheck 去缓存provider   一个Component持有一个DoubleCheck，所以最终还是需要依赖Component也是单例  (无论是singleton还是自定义scope都是这样，都会这样单例)
//    this.getSingletonEntryProvider =
//            DoubleCheck.provider(
//            SingletonEntiryModule_GetSingletonEntryFactory.create(builder.singletonEntiryModule));
//
//    this.getFolderProvider =
//            SingletonEntiryModule_GetFolderFactory.create(builder.singletonEntiryModule);
    public SingletonEntity getSingletonEntry(){
        return new SingletonEntity("single");
    }


    @Provides
    public Folder getFolder() {
        return new Folder();
    }

}

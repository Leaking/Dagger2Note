package com.quinn.dagger2note.lesson1;

// 无module


//一，编码

//首先，我们约定，A是一个类，b是A的一个成员变量，b的类型是B

//step 1, inject 标注希望被注入（被自动赋值）的成员变量b
//step 2，inject 标注B的构造方法
//step 3, compnent 标注一个工具型接口，它有两个作用，1，用户传递被注入的对象A，2，后期会通过它调用注入的实现，


//二，代码生成

//step 1, 生成一个Component的实现，名字是DaggerXXXX，最终我们通过这个Component来使用注入的逻辑
//step 2, 生成一个MembersInjecter对象，它会真正处理注入的逻辑（其实就是帮忙赋值一个成员变量，注意，这里就是直接赋值，没有反射，因为，希望被注入的成员变量，需要是public）
//        Injecter持有一个自动生成对象的Factory，为后续赋值做准备。（注意，这里如果被注入的对象B内部还有一个待注入的对象C，那么此处的injecter持有的FactoryB里面会有一个FactoryC）

//step 3, 生成一个Factory，它会帮忙构建一个编码阶段声明了希望被注入的成员变量。
//Summary: 我们编码的业务逻辑 -------> Component  ------>   Injecter  ------> Factory，这里后面三部分都是生成的代码，我们只需接触Component这一层





//三，疑问 Q & A
//Q1; 重命名很麻烦?
//A1; 会有点麻烦，生成的代码会随着工程代码重命名而重命名，但是像Daggerxxxxxx.java这些生成的类，类名无法跟随着改

// module

//除了可以用inject变量的方式注入，还可以用module + provide的方式注入（前者只能用于自定义类，而后者在此基础上用于第三方的类）


//module里的方法可以是静态的也可以是非静态的，生成的代码，会做出相应处理的
//module里的方法，返回类型只能是void或者某个支持注入的类型，
//  如果是返回void类型的方法，需要至少传入至少一个参数（0个参数会编译不过，多个参数还待验证），dagger会尝试去帮这个参数的所有成员变量做注入
//  如果是返回某个类型的方法，则需要这个类型支持注入

//@Module优先级别高于@Inject。


//    //Members injection methods may only return the injected type or void.

//import dagger.Provides;error: okhttp3.OkHttpClient is bound multiple times:
//@Provides okhttp3.OkHttpClient com.quinn.dagger2note.lesson2.chapter1.HttpActivityModule.provideOkHttpClient()
//@Provides okhttp3.OkHttpClient com.quinn.dagger2note.lesson2.chapter1.HttpActivityModule.provideFakeOne()

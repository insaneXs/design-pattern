package com.insanexs.designpattern.constructional.singleton;

/**
 * @Author: xieshang
 * @Description: Static Singleton
 * @Date: Create at 2019-11-05
 */
public class StaticSingleton {

    //通过类加载的机制保证线程的安全性
    //但无法做到惰性加载，可能会影响启动时间和内存使用
    private static StaticSingleton singleton = new StaticSingleton();

    private StaticSingleton(){

    }

    public static StaticSingleton getSingleton(){
        return singleton;
    }
}

package com.insanexs.designpattern.constructional.singleton;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-05
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton singleton;

    private SynchronizedSingleton(){

    }

    //通过同步的方式保证多线程下的安全性
    //但是每次获取对象都需要加锁和释放锁，影响性能
    public static synchronized SynchronizedSingleton getSingleton(){
        if(singleton == null)
            singleton = new SynchronizedSingleton();
        return singleton;
    }
}

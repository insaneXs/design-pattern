package com.insanexs.designpattern.constructional.singleton;

/**
 * @Author: xieshang
 * @Description: Thread Unsafe
 * @Date: Create at 2019-11-05
 */
public class ThreadUnsafeSingleton {

    private static ThreadUnsafeSingleton singleton;

    //私有化构造函数 禁止外部调用
    private ThreadUnsafeSingleton(){

    }

    //通过静态方法获取对象
    public static ThreadUnsafeSingleton getSingleton(){
        //当两个线程同时进入if判断时，每个线程都能够创建singleton对象
        if(singleton == null)
            singleton = new ThreadUnsafeSingleton();
        return singleton;
    }
}

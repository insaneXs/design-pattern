package com.insanexs.designpattern.creator.singleton;

/**
 * @Author: xieshang
 * @Description: Double Check
 * @Date: Create at 2019-11-05
 */
public class DoubleCheckSingleton {

    //避免JVM重排序造成的影响
    private static volatile DoubleCheckSingleton singleton;

    private DoubleCheckSingleton(){

    }

    public static DoubleCheckSingleton getSingleton(){
        if(singleton == null){
            //只针对关键的部分加锁，在已经创建过singleton后，再获取singleton时并不需要在上锁
            synchronized (DoubleCheckSingleton.class){
                //为了避免误判断，需要在同步块内再检查一次
                if(singleton == null)
                    singleton = new DoubleCheckSingleton();
            }
        }
        return singleton;
    }
}

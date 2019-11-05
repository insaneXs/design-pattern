package com.insanexs.designpattern.creator.singleton;

/**
 * @Author: xieshang
 * @Description: Enum singleton
 * @Date: Create at 2019-11-05
 */
public enum EnumSingleton {

    SINGLETON;

    //通过枚举创建单例
    public static EnumSingleton getSingleton(){
        return EnumSingleton.SINGLETON;
    }
}

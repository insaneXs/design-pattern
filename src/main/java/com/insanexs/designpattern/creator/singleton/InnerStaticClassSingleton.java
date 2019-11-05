package com.insanexs.designpattern.creator.singleton;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-05
 */
public class InnerStaticClassSingleton {

    public static InnerStaticClassSingleton getSingleton(){
        return InnerStaticClass.singleton;
    }

    private static class InnerStaticClass{
        private static final InnerStaticClassSingleton singleton = new InnerStaticClassSingleton();
    }
}

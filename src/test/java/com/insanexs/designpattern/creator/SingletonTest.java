package com.insanexs.designpattern.creator;

import com.insanexs.designpattern.creator.singleton.InnerStaticClassSingleton;
import com.insanexs.designpattern.creator.singleton.StaticSingleton;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-05
 */
public class SingletonTest {

    public static void main(String[] args) throws ClassNotFoundException {
        //对比两种方式，可以明显看出懒汉和饿汉的区别
        testInnerStaticClassSingleton();

        testStaticSingleton();
    }

    protected static void testInnerStaticClassSingleton() throws ClassNotFoundException {

        //STEP 1 add breakpoint at line 15 of InnerStaticClassSingleton.class

        //STEP 2 load class, and see whether it triggers breakpoint
        Class.forName("com.insanexs.designpattern.creator.singleton.InnerStaticClassSingleton");

        //STEP 3 invoke getSingleton method, and see whether it triggers breakpoint
        InnerStaticClassSingleton.getSingleton();

    }

    protected static void testStaticSingleton() throws ClassNotFoundException {
        //STEP 1 add breakpoint at line 12 of StaticSingleton.class

        //STEP 2 load class, and see whether it triggers breakpoint
        Class.forName("com.insanexs.designpattern.creator.singleton.StaticSingleton");

        //STEP 3 invoke getSingleton method, and see whether it triggers breakpoint
        StaticSingleton.getSingleton();
    }
}

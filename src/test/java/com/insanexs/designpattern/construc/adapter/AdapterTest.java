package com.insanexs.designpattern.construc.adapter;

import com.insanexs.designpattern.construct.adapter.ChinaMadeDevice;
import com.insanexs.designpattern.construct.adapter.USAPower;
import com.insanexs.designpattern.construct.adapter.classadapter.USAPowerClassAdapter;
import com.insanexs.designpattern.construct.adapter.objectadapter.USAPowerObjectAdapter;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-14
 */
public class AdapterTest {

    public static void main(String[] args){
        testClassAdapter();

        testObjectAdapter();
    }

    protected static void testClassAdapter(){
        System.out.println("Class Adapter");
        new ChinaMadeDevice(new USAPowerClassAdapter()).work();
    }

    protected static void testObjectAdapter(){
        System.out.println("Object Adapter");
        new ChinaMadeDevice(new USAPowerObjectAdapter(new USAPower())).work();
    }
}

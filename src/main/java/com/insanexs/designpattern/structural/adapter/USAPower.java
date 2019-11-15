package com.insanexs.designpattern.structural.adapter;

/**
 * @Author: xieshang
 * @Description: Adaptee
 * @Date: Create at 2019-11-14
 */
public class USAPower {

    public int usaOutput(){
        System.out.println("USA Power output 120V");
        return 120;
    }
}

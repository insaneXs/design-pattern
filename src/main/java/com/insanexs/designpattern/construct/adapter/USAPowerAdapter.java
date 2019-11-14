package com.insanexs.designpattern.construct.adapter;

/**
 * @Author: xieshang
 * @Description: Adapter
 * @Date: Create at 2019-11-14
 */
public class USAPowerAdapter extends USAPower implements ChinaPower{

    public int chinaOutput() {
        usaOutput();
        System.out.println("Start Adapt, Power Up");
        return 220;
    }

}

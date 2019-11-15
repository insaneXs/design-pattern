package com.insanexs.designpattern.construct.adapter.objectadapter;

import com.insanexs.designpattern.construct.adapter.ChinaPower;
import com.insanexs.designpattern.construct.adapter.USAPower;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-15
 */
public class USAPowerObjectAdapter implements ChinaPower {

    private USAPower power;

    public USAPowerObjectAdapter(USAPower power){
        this.power = power;
    }

    public int chinaOutput() {
        System.out.println("Start output ele, delegate to USAPower");
        power.usaOutput();
        System.out.println("Adapter USA Power, Power up");
        return 220;
    }
}

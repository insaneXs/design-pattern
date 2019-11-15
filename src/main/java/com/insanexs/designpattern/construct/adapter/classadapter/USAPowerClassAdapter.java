package com.insanexs.designpattern.construct.adapter.classadapter;

import com.insanexs.designpattern.construct.adapter.ChinaPower;
import com.insanexs.designpattern.construct.adapter.USAPower;

/**
 * @Author: xieshang
 * @Description: Adapter
 * @Date: Create at 2019-11-14
 */
public class USAPowerClassAdapter extends USAPower implements ChinaPower {

    public int chinaOutput() {
        usaOutput();
        System.out.println("Start Adapt, Power Up");
        return 220;
    }

}

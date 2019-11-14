package com.insanexs.designpattern.construc.adapter;

import com.insanexs.designpattern.construct.adapter.ChinaMadeDevice;
import com.insanexs.designpattern.construct.adapter.USAPowerAdapter;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-14
 */
public class AdapterTest {

    public static void main(String[] args){
        new ChinaMadeDevice(new USAPowerAdapter()).work();
    }
}

package com.insanexs.designpattern.structural.adapter;

/**
 * @Author: xieshang
 * @Description: Client
 * @Date: Create at 2019-11-14
 */
public class ChinaMadeDevice {

    private ChinaPower power;

    public ChinaMadeDevice(ChinaPower power){
        this.power = power;
    }

    public void work(){
        power.chinaOutput();
        System.out.println("Device Works");
    }
}

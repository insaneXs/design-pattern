package com.insanexs.designpattern.creator.factory.factorymethod;

import com.insanexs.designpattern.creator.factory.ConcreteProductType1B;
import com.insanexs.designpattern.creator.factory.ProductType1;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-05
 */
public class ConcreteProductType1BFactory implements Factory{

    public ProductType1 createProductType1() {
        return new ConcreteProductType1B();
    }
}

package com.insanexs.designpattern.constructional.factory.factorymethod;

import com.insanexs.designpattern.constructional.factory.ConcreteProductType1B;
import com.insanexs.designpattern.constructional.factory.ProductType1;

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

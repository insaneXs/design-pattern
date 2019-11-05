package com.insanexs.designpattern.creator.factory.abstractfactory;

import com.insanexs.designpattern.creator.factory.ConcreteProductType1A;
import com.insanexs.designpattern.creator.factory.ConcreteProductType2A;
import com.insanexs.designpattern.creator.factory.ProductType1;
import com.insanexs.designpattern.creator.factory.ProductType2;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-05
 */
public class ProductAFactory implements Factory{

    public ProductType1 createProductType1() {
        return new ConcreteProductType1A();
    }

    public ProductType2 createProductType2() {
        return new ConcreteProductType2A();
    }
}

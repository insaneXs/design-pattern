package com.insanexs.designpattern.constructional.factory.abstractfactory;

import com.insanexs.designpattern.constructional.factory.ConcreteProductType1B;
import com.insanexs.designpattern.constructional.factory.ConcreteProductType2B;
import com.insanexs.designpattern.constructional.factory.ProductType1;
import com.insanexs.designpattern.constructional.factory.ProductType2;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-05
 */
public class ProductBFactory implements Factory{

    public ProductType1 createProductType1() {
        return new ConcreteProductType1B();
    }

    public ProductType2 createProductType2() {
        return new ConcreteProductType2B();
    }
}

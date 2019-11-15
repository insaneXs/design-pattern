package com.insanexs.designpattern.constructional.factory.abstractfactory;

import com.insanexs.designpattern.constructional.factory.ProductType1;
import com.insanexs.designpattern.constructional.factory.ProductType2;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-05
 */
public class User {

    private ProductType1 productType1;

    private ProductType2 productType2;

    public User(Factory factory) {
        if(factory != null){
            productType1 = factory.createProductType1();

            productType2 = factory.createProductType2();
        }
    }

    public void useProduct(){
        if(productType1 != null)
            productType1.drink();

        if(productType2 != null)
            productType2.eat();
    }
}

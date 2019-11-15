package com.insanexs.designpattern.constructional.factory.factorymethod;

import com.insanexs.designpattern.constructional.factory.ProductType1;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-05
 */
public class User {

    private ProductType1 product;

    public User(Factory factory){
        if(factory != null)
            product = factory.createProductType1();
    }

    public void useProduct(){
        if(product != null)
            product.drink();
    }
}

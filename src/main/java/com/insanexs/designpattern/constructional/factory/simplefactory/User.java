package com.insanexs.designpattern.constructional.factory.simplefactory;

import com.insanexs.designpattern.constructional.factory.ProductType1;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-05
 */
public class User {

    private ProductType1 product;

    public User(int type){
        product = new SimpleFactory().createProduct(type);
    }

    public void useProduct(){
        if(product != null)
            product.drink();
    }
}

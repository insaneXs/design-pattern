package com.insanexs.designpattern.creator.factory.simplefactory;

import com.insanexs.designpattern.creator.factory.ConcreteProductType1B;
import com.insanexs.designpattern.creator.factory.ConcreteProductType1A;
import com.insanexs.designpattern.creator.factory.ProductType1;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-05
 */
public class SimpleFactory {


    public ProductType1 createProduct(int type){
        ProductType1 product = null;

        if(type == 1){
            product = new ConcreteProductType1A();
        }else if(type ==2){
            product = new ConcreteProductType1B();
        }

        return product;
    }
}

package com.insanexs.designpattern.constructional.factory.abstractfactory;

import com.insanexs.designpattern.constructional.factory.ProductType1;
import com.insanexs.designpattern.constructional.factory.ProductType2;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-05
 */
public interface Factory {

    ProductType1 createProductType1();

    ProductType2 createProductType2();
}

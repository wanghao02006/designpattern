package com.leiyu.designpattern.abstractfactory;

import java.util.Date;

/**
 * Created by wh on 2017/3/1.
 */
public interface AbstractFactory {

    Coat productCoat();

    Trousers productTrousers();

    Tshirt productTshirt();
}

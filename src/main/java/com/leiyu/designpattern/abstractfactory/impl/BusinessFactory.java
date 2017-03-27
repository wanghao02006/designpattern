package com.leiyu.designpattern.abstractfactory.impl;

import com.leiyu.designpattern.abstractfactory.AbstractFactory;
import com.leiyu.designpattern.abstractfactory.Coat;
import com.leiyu.designpattern.abstractfactory.Trousers;
import com.leiyu.designpattern.abstractfactory.Tshirt;

/**
 * Created by wh on 2017/3/3.
 */
public class BusinessFactory implements AbstractFactory {
    public Coat productCoat() {
        return new BusinessCoat();
    }

    public Trousers productTrousers() {
        return new BusinessTrousers();
    }

    public Tshirt productTshirt() {
        return new BusinessTshirt();
    }
}

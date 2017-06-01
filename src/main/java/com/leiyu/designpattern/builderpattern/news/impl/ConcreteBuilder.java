package com.leiyu.designpattern.builderpattern.news.impl;


import com.leiyu.designpattern.builderpattern.news.Builder;
import com.leiyu.designpattern.builderpattern.news.Product;

/**
 * Created by wh on 2017/5/11.
 */
public class ConcreteBuilder implements Builder {

    Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("part1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("part2");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}

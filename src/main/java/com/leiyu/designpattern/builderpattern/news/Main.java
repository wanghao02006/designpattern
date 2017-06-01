package com.leiyu.designpattern.builderpattern.news;

import com.leiyu.designpattern.builderpattern.news.impl.ConcreteBuilder;

/**
 * Created by wh on 2017/5/11.
 */
public class Main {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        director.constract();

        Product product = builder.retrieveResult();

        System.out.println(product);
    }

}

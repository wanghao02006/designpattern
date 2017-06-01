package com.leiyu.designpattern.builderpattern.news;

/**
 * Created by wh on 2017/5/11.
 */
public interface Builder {

    void buildPart1();

    void buildPart2();

    Product retrieveResult();
}

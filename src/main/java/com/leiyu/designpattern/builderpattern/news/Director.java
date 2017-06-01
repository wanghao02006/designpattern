package com.leiyu.designpattern.builderpattern.news;

/**
 * Created by wh on 2017/5/11.
 */
public class Director {

    private Builder builder = null;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void constract(){
        this.builder.buildPart1();
        this.builder.buildPart2();
    }
}

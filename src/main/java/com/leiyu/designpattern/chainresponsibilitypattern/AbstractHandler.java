package com.leiyu.designpattern.chainresponsibilitypattern;

/**
 * Created by wh on 2017/5/31.
 */
public abstract class AbstractHandler implements Handler {
    protected Handler next ;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }
}

package com.leiyu.designpattern.chainresponsibilitypattern.impl;

import com.leiyu.designpattern.chainresponsibilitypattern.AbstractHandler;
import com.leiyu.designpattern.chainresponsibilitypattern.Handler;
import com.leiyu.designpattern.chainresponsibilitypattern.pojo.RequestBody;

/**
 * Created by wh on 2017/5/31.
 */
public class ConcreteHandler2 extends AbstractHandler{

    public ConcreteHandler2() {

    }

    public ConcreteHandler2(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(RequestBody body) {
        if(body.getResponse() == null || "".equals(body.getResponse())) {
            body.setResponse("Before ConcreteHandler2 handled! \n");
        }else {
            body.setResponse(body.getResponse() + "Before ConcreteHandler2 handled! \n");
        }
        if(null != this.next){
            this.next.handleRequest(body);
        }
        body.setResponse(body.getResponse() + "After ConcreteHandler2 handled! \n");
    }
}

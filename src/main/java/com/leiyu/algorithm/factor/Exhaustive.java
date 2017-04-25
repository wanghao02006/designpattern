package com.leiyu.algorithm.factor;

/**
 * 穷举模式解决问题，鸡兔同笼问题
 * Created by wh on 2017/4/25.
 */
public class Exhaustive {

    public static void main(String[] args) {
        int rabbit = 0 ;
        int chicken = 0 ;
        for(;rabbit < 35 ; rabbit++){
            chicken = 35 - rabbit;
            if(4 * rabbit + 2 * chicken != 94){
                continue;
            }else{
                System.out.println("chicken:"+chicken);
                System.out.println("rabbit:" + rabbit);
                System.out.println("------------------------------------");
            }
        }
    }
}

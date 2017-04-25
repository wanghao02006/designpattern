package com.leiyu.algorithm.factor;

/**
 * 递推方法解决问题-斐波那契数列
 * Created by wh on 2017/4/25.
 */
public class Recursive {

    public static void main(String[] args) {
        System.out.println(fibonacci(12));
    }

    public static int fibonacci(int num){
        if(num == 1 || num == 2){
            return 1;
        }else{
            return fibonacci(num -1) + fibonacci(num - 2);
        }
    }

}

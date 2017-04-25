package com.leiyu.algorithm.factor;

/**
 * 递归算法-阶乘
 * Created by wh on 2017/4/25.
 */
public class Recursion {

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static int factorial(int num){
        if(num <= 1){
            return 1;
        }else {
            return num * factorial(num - 1);
        }
    }


}

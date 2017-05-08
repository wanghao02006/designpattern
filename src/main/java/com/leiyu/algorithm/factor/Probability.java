package com.leiyu.algorithm.factor;

/**
 * Created by wh on 2017/4/28.
 */
public class Probability {

    public static void main(String[] args) {
        System.out.println(pi(5000000000000l));
    }

    public static double pi(long numbers){
        double sum = 0;
        for(int i = 0 ; i < numbers ; i++){
            double x = Math.random();
            double y = Math.random();
            if((x*x + y*y) < 1){
                sum += 1;
            }
        }
        return 4 * (sum / numbers);
    }
}

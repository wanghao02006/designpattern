package com.leiyu.algorithm.mathematics;

/**
 * Created by wh on 2017/5/10.
 */
public class LeapYear {

    public static boolean isLeapYear(int year){
        if((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 1970 ; i < 3000 ; i++){
            if(isLeapYear(i)){
                System.out.println(i);
            }
        }
    }
}

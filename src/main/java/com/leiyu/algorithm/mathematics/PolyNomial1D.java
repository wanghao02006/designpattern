package com.leiyu.algorithm.mathematics;

import java.text.DecimalFormat;

/**
 * Created by wh on 2017/5/10.
 */
public class PolyNomial1D {


    public static void main(String[] args) {
        double a[] = {-15,-7,7.0,2.0,-3.0,7.0,3.0};
        double x[] = {-2.0,-0.5,1.0,2.0,3.7,4.0};
        double result;

        DecimalFormat df = new DecimalFormat("0.000000E000");
        DecimalFormat df1 = new DecimalFormat("0.00");
        System.out.println();
        for (int i = 0 ; i < x.length ; i++){
            result = ployNomial(a,a.length,x[i]);
            System.out.println("x="+df1.format(x[i])+"时，p(x)=" + df.format(result));
        }
    }

    private static double ployNomial(double[] a, int length, double x) {
        double result = a[length - 1];
        for(int i = length - 2 ; i >= 0 ; i--){
            result = result * x + a[i];
        }
        return result;
    }
}

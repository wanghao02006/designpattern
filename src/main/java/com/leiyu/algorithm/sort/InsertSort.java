package com.leiyu.algorithm.sort;

/**
 * Created by wh on 2017/4/1.
 */
public class InsertSort<T extends Comparable> {


    public T[] sortAsc(T[] arrs){
        if(null == arrs || arrs.length < 2){
            return arrs;
        }

        for(int i = 1 ; i < arrs.length; i++){
            for(int j = i ; j > 0 ; j--){
                T lnum = arrs[j];
                T fnum = arrs[j - 1];
                if(lnum.compareTo(fnum) < 0){
                    T swap = lnum;
                    arrs[j] = fnum;
                    arrs[j - 1] = swap;
                }
            }
        }
        return arrs;
    }

    public T[] sortDesc(T[] arrs){
        if(null == arrs || arrs.length < 2){
            return arrs;
        }

        for(int i = 1 ; i < arrs.length; i++){
            for(int j = i ; j > 0 ; j--){
                T lnum = arrs[j];
                T fnum = arrs[j - 1];
                if(lnum.compareTo(fnum) > 0){
                    T swap = lnum;
                    arrs[j] = fnum;
                    arrs[j - 1] = swap;
                }else{
                    break;
                }
            }
        }

        return arrs;
    }

    public static void main(String[] args) {
        InsertSort<Integer> sort = new InsertSort<Integer>();
        Integer[] nums = {1,20,4,6,3,2,8,7,0};
        sort.sortAsc(nums);
        for(Integer num : nums){
            System.out.println(num);
        }

        System.out.println("---------------------------------------");
        sort.sortDesc(nums);
        for(Integer num : nums){
            System.out.println(num);
        }
    }

}

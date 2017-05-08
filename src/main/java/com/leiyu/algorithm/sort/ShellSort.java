package com.leiyu.algorithm.sort;

/**
 * Created by wh on 2017/5/2.
 */
public class ShellSort<T extends Comparable> {

    public T[] sortAsc(T[] arrs){
        if(arrs == null || arrs.length < 2 ){
            return  arrs;
        }
        for(int r = arrs.length/2 ; r >= 1 ; r /= 2){
            for(int i = r ; i < arrs.length ; i++){
                T t = arrs[i];
                int j = i - r ;
                while (j >= 0 && t.compareTo(arrs[j]) < 0){
                    arrs[j + r] = arrs[j];
                    j -= r;
                }
                arrs[j+r] =t;
            }
        }
        return arrs;
    }

    public T[] sortDesc(T[] arrs){
        if(arrs == null || arrs.length < 2 ){
            return  arrs;
        }
        for(int r = arrs.length/2 ; r >= 1 ; r /= 2){
            for(int i = r ; i < arrs.length ; i++){
                T t = arrs[i];
                int j = i - r ;
                while (j >= 0 && t.compareTo(arrs[j]) > 0){
                    arrs[j + r] = arrs[j];
                    j -= r;
                }
                arrs[j+r] =t;
            }
        }
        return arrs;
    }

    public static void main(String[] args) {
        ShellSort<Integer> sort = new ShellSort<Integer>();
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

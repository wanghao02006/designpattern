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
            T t = arrs[i];
            int j = i;
            while (j > 0 && arrs[j-1].compareTo(t) > 0){
                arrs[j] = arrs[j-1];
                j--;
            }
            arrs[j] = t;
        }
        return arrs;
    }

    public T[] sortDesc(T[] arrs){
        if(null == arrs || arrs.length < 2){
            return arrs;
        }

        for(int i = 1 ; i < arrs.length; i++){
            T t = arrs[i];
            int j = i;
            while (j > 0 && arrs[j-1].compareTo(t) < 0){
                arrs[j] = arrs[j-1];
                j--;
            }
            arrs[j] = t;
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

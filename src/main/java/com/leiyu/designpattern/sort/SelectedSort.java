package com.leiyu.designpattern.sort;

/**
 * Created by wh on 2017/3/31.
 */
public class SelectedSort<T extends Comparable> {


    public T[] sortAsc(T[] arrs){
        if (null == arrs){
            return null;
        }

        int i = 0 ;
        while (i < arrs.length){
            T numi = arrs[i];
            for(int j = i+1 ; j < arrs.length ; j++){
                T now = arrs[j];
                if(now.compareTo(numi) < 0){
                    T swap = numi;
                    numi = now;
                    arrs[j] = swap;
                }
            }
            arrs[i] = numi;
            i++;
        }
        return arrs;
    }


    public T[] sortDesc(T[] arrs){
        if (null == arrs){
            return null;
        }

        int i = 0 ;
        while (i < arrs.length){
            T numi = arrs[i];
            for(int j = i+1 ; j < arrs.length ; j++){
                T now = arrs[j];
                if(now.compareTo(numi) > 0){
                    T swap = numi;
                    numi = now;
                    arrs[j] = swap;
                }
            }
            arrs[i] = numi;
            i++;
        }
        return arrs;
    }

    public static void main(String[] args) {
        SelectedSort<Integer> sort = new SelectedSort<Integer>();
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

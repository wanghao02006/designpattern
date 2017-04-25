package com.leiyu.algorithm.sort;

/**
 * Created by wh on 2017/3/31.
 */
public class SelectedSort<T extends Comparable> {


    public T[] sortAsc(T[] arrs){
        if (null == arrs || arrs.length < 2){
            return arrs;
        }

        int i = 0 ;
        int index = 0;
        while (i < arrs.length){
            index = i;
            for(int j = i+1 ; j < arrs.length ; j++){
                if(arrs[index].compareTo(arrs[j]) > 0){
                    index = j;
                }
            }
            if(index != i){
                T swap = arrs[i];
                arrs[i] = arrs[index];
                arrs[index] = swap;
            }
            i++;
        }
        return arrs;
    }


    public T[] sortDesc(T[] arrs){
        if (null == arrs || arrs.length < 2){
            return arrs;
        }

        int i = 0 ;
        int index = 0;
        while (i < arrs.length){
            index = i;
            for(int j = i+1 ; j < arrs.length ; j++){
                if(arrs[index].compareTo(arrs[j]) < 0){
                    index = j;
                }
            }
            if(index != i){
                T swap = arrs[i];
                arrs[i] = arrs[index];
                arrs[index] = swap;
            }
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

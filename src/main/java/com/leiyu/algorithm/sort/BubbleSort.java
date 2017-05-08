package com.leiyu.algorithm.sort;

/**
 * Created by wh on 2017/3/31.
 */
public class BubbleSort<T extends Comparable> {

    public T[] sortAsc(T[] arrs){
        if(arrs == null){
            return  null;
        }
        for(int i = 1 ; i < arrs.length ; i++){
            for(int j = 0 ; j < arrs.length - i ; j++){
                if(arrs[j].compareTo(arrs[j+1]) > 0){
                    T swap = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = swap;
                }
            }
        }
        return arrs;
    }

    public T[] sortDesc(T[] arrs){
        if(arrs == null){
            return  null;
        }
        for(int i = 1 ; i < arrs.length ; i++){
            for(int j = 0 ; j < arrs.length - i ; j++){
                if(arrs[j].compareTo(arrs[j+1]) < 0){
                    T swap = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = swap;
                }
            }
        }
        return arrs;
    }

    public static void main(String[] args) {
        BubbleSort<Integer> sort = new BubbleSort<Integer>();
        Integer[] nums = {1,20,4,6,3,2,8,7,0};
        sort.sortAsc(nums);
        for(Integer num : nums){
            System.out.print(num + " ");
        }
        sort.sortDesc(nums);
        for(Integer num : nums){
            System.out.print(num + " ");
        }

//        int[] arr = {2,3,4,5};
//        int a = arr[2];
//        arr[2] = 7;
//        System.out.println("a:" + a + ", arr[2]:" + arr[2]);
    }
}

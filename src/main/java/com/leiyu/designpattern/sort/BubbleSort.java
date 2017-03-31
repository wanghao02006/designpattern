package com.leiyu.designpattern.sort;

/**
 * Created by wh on 2017/3/31.
 */
public class BubbleSort<T extends Comparable> {

    public T[] sortAsc(T[] arrs){
        if(arrs == null){
            return  null;
        }
        for(int i = arrs.length -1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                T last = arrs[i];
                T now = arrs[j];
                if(now.compareTo(last) > 0){
                    T swap = last;
                    arrs[i] = now;
                    arrs[j] = swap;
                }
            }
        }
        return arrs;
    }

    public T[] sortDesc(T[] arrs){
        if(arrs == null){
            return  null;
        }
        for(int i = arrs.length -1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                T last = arrs[i];
                T now = arrs[j];
                if(now.compareTo(last) < 0){
                    T swap = last;
                    arrs[i] = now;
                    arrs[j] = swap;
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
            System.out.println(num);
        }

        System.out.println("---------------------------------------");
        sort.sortDesc(nums);
        for(Integer num : nums){
            System.out.println(num);
        }
    }
}

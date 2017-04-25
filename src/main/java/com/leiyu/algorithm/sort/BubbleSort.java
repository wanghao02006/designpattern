package com.leiyu.algorithm.sort;

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

    public T[] sortAsc1(T[] arrs){
        if(null == arrs || arrs.length < 2 ){
            return arrs;
        }
        for(int i = 0 ; i < arrs.length ; i++){
            for(int j = 1 ; j < arrs.length - i ; j++){
                T fnum = arrs[j - 1];
                T lnum = arrs[j];
                if(lnum.compareTo(fnum) < 0){
                    T swap = lnum;
                    arrs[j] = fnum;
                    arrs[j-1] = swap;
                }
            }
        }
        return arrs;
    }

    public static void main(String[] args) {
        BubbleSort<Integer> sort = new BubbleSort<Integer>();
        Integer[] nums = {1,20,4,6,3,2,8,7,0};
        sort.sortAsc1(nums);
        for(Integer num : nums){
            System.out.println(num);
        }

        System.out.println("---------------------------------------");
        sort.sortDesc(nums);
        for(Integer num : nums){
            System.out.println(num);
        }

//        int[] arr = {2,3,4,5};
//        int a = arr[2];
//        arr[2] = 7;
//        System.out.println("a:" + a + ", arr[2]:" + arr[2]);
    }
}

package com.leiyu.algorithm.sort;

/**
 * Created by wh on 2017/3/31.
 */
public class SelectedSort<T extends Comparable> {


    public T[] sortAsc(T[] arrs){
        if (null == arrs || arrs.length < 2){
            return arrs;
        }
        for(int i = 0 ; i < arrs.length ; i++){
            int index = i;
            for(int j = i + 1 ; j < arrs.length ; j++){
                if(arrs[j].compareTo(arrs[index]) < 0){
                    index = j;
                }
            }
            swap(arrs,index,i);
        }
        return arrs;
    }

    private void swap(T[] arrs, int index, int i) {
        if(index != i ){
            T swap = arrs[index];
            arrs[index] = arrs[i];
            arrs[i] = swap;
        }
    }


    public T[] sortDesc(T[] arrs){
        if (null == arrs || arrs.length < 2){
            return arrs;
        }

       for(int i = 0 ; i < arrs.length ; i++){
            int index = i;
            int j = arrs.length - 1;
            while (j > i){
                if(arrs[j].compareTo(arrs[index]) > 0){
                    index = j;
                }
                j--;
            }
            swap(arrs,index,i);
       }
        return arrs;
    }

    public static void main(String[] args) {
        SelectedSort<Integer> sort = new SelectedSort<Integer>();
        Integer[] nums = {1,20,4,6,3,2,8,7,0};
        sort.sortAsc(nums);
        for(Integer num : nums){
            System.out.print(num+" ");
        }

        sort.sortDesc(nums);
        for(Integer num : nums){
            System.out.print(num + ",");
        }
    }

}

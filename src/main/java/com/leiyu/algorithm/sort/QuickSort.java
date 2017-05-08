package com.leiyu.algorithm.sort;

/**
 * Created by wh on 2017/4/5.
 */
public class QuickSort<T extends Comparable> {

    public T[] sortAsc(T[] arrs){
         sortQuick(arrs,0,arrs.length-1,true);
        return arrs;
    }


    private void sortQuick(T[] arrs,int left,int right,boolean isAsc){
        int ltemp = left,rtemp = right,baseIndex = (left + right)/2;
        T base = arrs[baseIndex];
        T temp = null;
        while (ltemp < rtemp){
            while (arrs[ltemp].compareTo(base) < 0){
                ltemp++;
            }
            while (arrs[rtemp].compareTo(base) > 0){
                rtemp--;
            }
            if(ltemp <= rtemp){
                temp = arrs[rtemp];
                arrs[rtemp] = arrs[ltemp];
                arrs[ltemp] = temp;
                --rtemp;
                ++ltemp;
            }
        }
        if(ltemp == rtemp){
            ltemp++;
        }
        if(left < rtemp){
            sortQuick(arrs,left,ltemp-1,true);
        }
        if(ltemp < right){
            sortQuick(arrs,rtemp+1,right,true);
        }

    }

    public static void main(String[] args) {
        QuickSort<Integer> sort = new QuickSort<Integer>();
//        Integer[] nums = {1,20,4,6,3,2,8,7,0};
        Integer[] nums = {1,2,2,2,3,2,8,7,0};
        sort.sortAsc(nums);
        for(Integer num : nums){
            System.out.println(num);
        }
    }

}

package com.leiyu.algorithm.search.impl;

import com.leiyu.algorithm.search.Search;

/**
 * 折半查找对应数组必须是有序的
 * Created by wh on 2017/5/5.
 */
public class BinarySearch implements Search {
    @Override
    public int search(int[] arrs, int t) {
        int ltemp = 0 ,rtepm = arrs.length-1,index = -1;
        quickSort(arrs,0,arrs.length-1);
        while (ltemp <= rtepm){
            int midtemp = (ltemp + rtepm ) / 2;
            int intemp = t - arrs[midtemp];
            if(intemp == 0){
                index = midtemp;
                break;
            }else if(intemp > 0){
                ltemp = midtemp + 1;
            }else{
                rtepm = midtemp - 1;
            }
        }
        return index;
    }

    private void quickSort(int[] arrs,int left,int right){
        int ltemp = left,rtemp = right,middle = (left + right) / 2;
        int value = arrs[middle];
        while (ltemp <= rtemp){
            while (arrs[ltemp] < value){
                ltemp++;
            }
            while (arrs[rtemp] > value){
                rtemp--;
            }
            if(ltemp <= rtemp){
                int swap = arrs[ltemp];
                arrs[ltemp] = arrs[rtemp];
                arrs[rtemp] = swap;
                ltemp++;
                rtemp--;
            }
        }
        if(ltemp == rtemp){
            ltemp++;
        }
        if(left < rtemp){
            quickSort(arrs,left,ltemp - 1);
        }
        if(right > ltemp){
            quickSort(arrs,rtemp+1,right);
        }
    }

    private int search(int[] arrs,int left,int right,int t){
        int index = -1;

        if(left <= right){
            int half = (left + right) / 2;

            int value = arrs[half];
            if(value == t){
                index = half;
            }else if(value - t < 0){
                index = search(arrs,half + 1,right,t);
            }else {
                index = search(arrs,left,half-1,t);
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arrs = {1,2,11,4,5,6,7,8,9,10};
        BinarySearch search = new BinarySearch();
        int i = search.search(arrs,6);
        System.out.println(i);
    }
}

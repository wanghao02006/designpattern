package com.leiyu.algorithm.sort;

import java.util.Random;

/**
 * Created by wh on 2017/4/1.
 */
public class Main {

    public static final int COUNT = 100000;

    public static void main(String[] args) {
        Integer[] nums = new Integer[COUNT];

        Random random = new Random(1000000l);
        for (int i = 0 ; i < COUNT ; i++){
            nums[i] = random.nextInt();
        }
        BubbleSort<Integer> sort1 = new BubbleSort();
        SelectedSort<Integer> sort2 = new SelectedSort<Integer>();
        InsertSort<Integer> sort3 = new InsertSort<Integer>();
        Integer[] nums1 = nums.clone();
        Integer[] nums2 = nums.clone();
        Integer[] nums3 = nums.clone();
        long start = System.currentTimeMillis();
        sort1.sortAsc(nums1);
        System.out.println("user time:" + (System.currentTimeMillis() - start));
        System.out.println("-----------------------------------------------------");
        start = System.currentTimeMillis();
        sort2.sortAsc(nums2);
        System.out.println("user time:" + (System.currentTimeMillis() - start));
        System.out.println("-----------------------------------------------------");
        start = System.currentTimeMillis();
        sort3.sortAsc(nums3);
        System.out.println("user time:" + (System.currentTimeMillis() - start));
        System.out.println("-----------------------------------------------------");


    }

}

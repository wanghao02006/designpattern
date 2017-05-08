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
            nums[i] = Math.abs(random.nextInt());
        }
        BubbleSort<Integer> sort1 = new BubbleSort();
        SelectedSort<Integer> sort2 = new SelectedSort<Integer>();
        InsertSort<Integer> sort3 = new InsertSort<Integer>();
        ShellSort<Integer> sort4 = new ShellSort<Integer>();
        QuickSort<Integer> sort5 = new QuickSort<>();
        Integer[] nums1 = nums.clone();
        Integer[] nums2 = nums.clone();
        Integer[] nums3 = nums.clone();
        Integer[] nums4 = nums.clone();
        Integer[] nums5 = nums.clone();
        long start = System.currentTimeMillis();
        sort1.sortAsc(nums1);
        System.out.println("BubbleSort user time:" + (System.currentTimeMillis() - start));
        System.out.println("-----------------------------------------------------");
        start = System.currentTimeMillis();
        sort2.sortAsc(nums2);
        System.out.println("SelectedSort user time:" + (System.currentTimeMillis() - start));
        System.out.println("-----------------------------------------------------");
        start = System.currentTimeMillis();
        sort3.sortAsc(nums3);
        System.out.println("InsertSort user time:" + (System.currentTimeMillis() - start));
        System.out.println("-----------------------------------------------------");
        start = System.currentTimeMillis();
        Integer[] result = sort4.sortAsc(nums4);
        System.out.println("ShellSort user time:" + (System.currentTimeMillis() - start));
        System.out.println("-----------------------------------------------------");
        start = System.currentTimeMillis();
        sort5.sortAsc(nums5);
        System.out.println("ShellSort user time:" + (System.currentTimeMillis() - start));
        System.out.println("-----------------------------------------------------");

    }

}

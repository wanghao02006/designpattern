package com.leiyu.algorithm.search.impl;

import com.leiyu.algorithm.search.Search;

/**
 * Created by wh on 2017/5/5.
 */
public class SimpleSearch implements Search {


    @Override
    public int search(int[] arrs, int t) {
        int index = -1;
        if(null != arrs && arrs.length > 0){
            for(int i = 0 ; i < arrs.length ; i++){
                if(arrs[i] == t){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }


    public static void main(String[] args) {
        int[] arrs = {1,2,3,4,5,6,7,8,9,0};
        SimpleSearch search = new SimpleSearch();
        int i = search.search(arrs,6);
        System.out.println(i);
    }
}

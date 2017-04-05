package com.leiyu.designpattern.sort;

/**
 * Created by wh on 2017/4/5.
 */
public class QuickSort<T extends Comparable> {

    public T[] sortAsc(T[] arrs){
         sortQuick(arrs,0,(arrs.length -1));
        return arrs;
    }


    private void sortQuick(T[] arrs,int first,int last){
        T fnum = arrs[first];
        while (last - first > 1){
            for(int i = first ; i < last ; i++){
                if(arrs[i].compareTo(fnum) < 0){
                    arrs[first++] = arrs[i];
                    break;
                }
            }
            if(first == last){
                arrs[first] = fnum;
                break;
            }
            for(int j = last ; j > first; j--){
                if(arrs[j].compareTo(fnum) > 0){
                    arrs[last--] = arrs[j];
                    break;
                }
            }
            if(first == last){
                arrs[first] = fnum;
                break;
            }
        }
        sortQuick(arrs,0,first);
        sortQuick(arrs,first+1,arrs.length);
    }

    public static void main(String[] args) {
        QuickSort<Integer> sort = new QuickSort<Integer>();
        Integer[] nums = {1,20,4,6,3,2,8,7,0};
        sort.sortAsc(nums);
        for(Integer num : nums){
            System.out.println(num);
        }
    }

}

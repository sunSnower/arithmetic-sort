package com.arithmetic.sort;
public class MergeSort{
    int[] arr;
    MergeSort(int[] arr){
        this.arr = arr;
    }

    public void mergeSort(){
        for(int space = 2; space <= arr.length/2; space *= 2){
            for(int i = 0; i < arr.length-1; i += space){
                int[] tempArr = new int[space];

            }
        }
    }

    public void swap(int li, int ri){
        int tempValue = arr[li];
        arr[li] = arr[ri];
        arr[ri] = tempValue;
    }

    /**
     * 将相邻的两段排序并合并
     * @param begin
     * @param end
     */
    public void merge(int begin, int end){
        int[] tempArr = new int[begin-end];
        int middle = (end-begin)/2;
        int li = begin;
        int ri = middle+1;
        while(true){
            if(li>=middle && ri>=end){
                break;
            }

        }
    }
}
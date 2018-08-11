package com.arithmetic.sort;

import java.util.Arrays;

public class MergeSort{
    int[] arr;
    MergeSort(int[] arr){
        this.arr = arr;
    }

    public void mergeSortRecursion(int[] result, int start, int end){
        if(start >= end){
            return;
        }
        int len = end - start;
        int pivot = ((len - 1) >> 1)  + start;
        int start1 = start, end1 = pivot;
        int start2 = pivot + 1, end2 = end;

        mergeSortRecursion(result, start1, end1);
        mergeSortRecursion(result, start2, end2);

        int k = start;
        while(start1<=end1 && start2<=end2){
            result[k++] = arr[start1]<arr[start2] ? arr[start1++]:arr[start2++];
        }
        while(start1<=end1){
            result[k++] = arr[start1++];
        }
        while(start2<=end2){
            result[k++] = arr[start2++];
        }
     }

     public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] result = new int[arr.length];

        MergeSort mergeSort = new MergeSort(arr);
        mergeSort.mergeSortRecursion(result, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
     }
}
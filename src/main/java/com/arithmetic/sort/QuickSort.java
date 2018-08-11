package com.arithmetic.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int head, int tail){
        if((head >= tail) || (arr.length <= 1) || (arr == null)){
            return;
        }
        int tempHead = head;
        int tempTail = tail;
        int pivot = arr[(head+tail)/2];
        while(tempHead <= tempTail){
            while(arr[tempHead] < pivot){
                ++tempHead;
            }
            while(arr[tempTail] > pivot){
                --tempTail;
            }
            if(tempHead < tempTail){
                int tempValue = arr[tempHead];
                arr[tempHead] = arr[tempTail];
                arr[tempTail] = tempValue;
                ++tempHead;
                --tempTail;
            }
            else if(tempHead == tempTail){
                ++tempHead;
            }
        }
        quickSort(arr, head, tempTail);
        quickSort(arr, tempHead, tail);
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

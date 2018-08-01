package com.arithmetic.sort;

public class SelectSort {
    public static void selectSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6};
        selectSort(arr);
        for(int value : arr){
            System.out.println(value);
        }
    }
}

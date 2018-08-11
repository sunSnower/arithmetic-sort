package com.arithmetic.sort;

import com.sun.org.apache.xalan.internal.xsltc.dom.MultiValuedNodeHeapIterator;

import java.util.Arrays;

public class HeapSort{
    int[] arr;

    HeapSort(int[] arr){
        this.arr = arr;
    }

    public void sort(){
        int len = arr.length - 1;
        int index = (len-1) >> 1;
        for(int i = index; i >= 0; i--){
            maxHeapify(i, len);
        }

        for(int i = arr.length-1; i >= 0; i--){
            swap(i, 0);
            maxHeapify(0, i-1);
        }
    }

    public void maxHeapify(int index, int len){
        int li = (index << 1) + 1;
        int ri = li + 1;
        int cMax = li;
        if(li > len){
            return;
        }
        if(ri <= len && arr[li] < arr[ri]){
            cMax = ri;
        }
        if(arr[index] < arr[cMax]){
            swap(index, cMax);
            maxHeapify(cMax, len);
        }
    }

    public void swap(int li, int ri){
        int value = arr[li];
        arr[li] = arr[ri];
        arr[ri] = value;
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        new HeapSort(arr).sort();
        System.out.println(Arrays.toString(arr));
    }
}
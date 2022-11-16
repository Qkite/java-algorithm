package com.likelion.algorithm1115;

import java.util.Arrays;

public class QuickSort2 {

    int[] sort(int[] arr){
        int leftIdx = 0;
        int rightIdx = arr.length-1;
        int pivotIdx = arr.length/2;
        while(leftIdx < pivotIdx) {
            if (arr[pivotIdx] <= arr[leftIdx]) {
                int temp = arr[pivotIdx];
                arr[pivotIdx] = arr[leftIdx];
                arr[leftIdx] = temp;
                pivotIdx--;
                leftIdx++;
            } else {
                leftIdx++;

            }
        }

        while(leftIdx <= rightIdx){
            if(arr[rightIdx] <= arr[leftIdx]){
                int temp = arr[rightIdx];
                arr[rightIdx] = arr[leftIdx];
                arr[leftIdx] = temp;
                rightIdx--;
                leftIdx++;
            } else {
                leftIdx++;

            }

        }

        return arr;
    }


    public static void main(String[] args) {
        QuickSort2 quickSort2 = new QuickSort2();
        System.out.println(Arrays.toString(quickSort2.sort(new int[] {20, 18, 5, 19, 40, 50, 5, 25})));

    }
}

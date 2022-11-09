package com.likelion.algorithm1109;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        for (int i = 0; i < arr.length; i++) {
            // 최솟값이 들어있는 인덱스 찾기
            int idx = i;
            int minIdx = idx;;

            for (int j = idx; j < arr.length; j++) {
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }

            }

            int temp = arr[idx];
            arr[idx] = arr[minIdx];
            arr[minIdx] = temp;

            System.out.println(minIdx);
            System.out.println(Arrays.toString(arr));
        }

    }
}

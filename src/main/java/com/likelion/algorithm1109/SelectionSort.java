package com.likelion.algorithm1109;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        for (int i = 0; i < arr.length; i++) {
            // 최솟값이 들어있는 인덱스 찾기
            int idx = i;
            int minIdx = idx;
            int minValue = arr[minIdx];

            for (int j = idx; j < arr.length; j++) {
                if(arr[j] < minValue){
                    minIdx = j;
                    minValue = arr[j];
                }

            }
            System.out.println(minIdx);
        }



    }
}

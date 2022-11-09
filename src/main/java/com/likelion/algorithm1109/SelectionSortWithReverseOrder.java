package com.likelion.algorithm1109;

import java.util.Arrays;

interface Condition{

    void sorting(int[] arr);

}

public class SelectionSortWithReverseOrder {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        Condition condition = new Condition() {
            @Override
            public void sorting(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    // 최솟값이 들어있는 인덱스 찾기
                    int idx = i;
                    int maxIdx = idx;

                    for (int j = idx; j < arr.length; j++) {
                        if (arr[j] > arr[maxIdx]) {
                            maxIdx = j;
                        }
                    }

                    int temp = arr[idx];
                    arr[idx] = arr[maxIdx];
                    arr[maxIdx] = temp;

                    System.out.println(maxIdx);
                    System.out.println(Arrays.toString(arr));
                }
            }
        };

        condition.sorting(arr);
    }

}

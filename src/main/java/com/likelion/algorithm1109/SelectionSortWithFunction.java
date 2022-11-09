package com.likelion.algorithm1109;

import java.util.Arrays;
import java.util.function.BiFunction;

public class SelectionSortWithFunction {

    public void selection(int[] arr, BiFunction<Integer, Integer, Boolean> compare) {
        for (int i = 0; i < arr.length; i++) {
            // 최솟값이 들어있는 인덱스 찾기
            int idx = i;
            int maxIdx = idx;
            ;

            for (int j = idx; j < arr.length; j++) {
                if (compare.apply(arr[maxIdx], arr[j])) {
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

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        SelectionSortWithFunction selectionSortWithFunction = new SelectionSortWithFunction();
        selectionSortWithFunction.selection(arr, (a,b) -> a<b);
        selectionSortWithFunction.selection(arr, (a,b) -> a>b);

    }


}

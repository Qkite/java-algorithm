package com.likelion.algorithm1109;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class SelectionSortWithPredicate {

    // BiPredicate는 input 2가지의 형태를 받음 -> boolean으로 return

    public void selection(int[] arr, BiPredicate<Integer, Integer> compare) {
        for (int i = 0; i < arr.length; i++) {
            // 최솟값이 들어있는 인덱스 찾기
            int idx = i;
            int maxIdx = idx;
            ;

            for (int j = idx; j < arr.length; j++) {
                if (compare.test(arr[maxIdx], arr[j])) {
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

        SelectionSortWithPredicate selectionSortWithPredicate = new SelectionSortWithPredicate();
        selectionSortWithPredicate.selection(arr, (a,b) -> a<b);
        selectionSortWithPredicate.selection(arr, (a,b) -> a>b);

    }
}

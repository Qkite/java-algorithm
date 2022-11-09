package com.likelion.algorithm1109;

import java.util.Arrays;

interface Condition1{

    boolean sortingCondition(int a, int b);

}

public class SelectionSortWithInterfaceAndLambda {

    public void selection(int[] arr, Condition1 condition1) {
        for (int i = 0; i < arr.length; i++) {
            // 최솟값이 들어있는 인덱스 찾기
            int idx = i;
            int maxIdx = idx;
            ;

            for (int j = idx; j < arr.length; j++) {
                if (condition1.sortingCondition(arr[maxIdx], arr[j])) {
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

        SelectionSortWithInterfaceAndLambda selectionSortWithInterfaceAndLambda = new SelectionSortWithInterfaceAndLambda();
        selectionSortWithInterfaceAndLambda.selection(arr, (a,b) -> a<b);
        selectionSortWithInterfaceAndLambda.selection(arr, (a,b) -> a>b);

    }


}

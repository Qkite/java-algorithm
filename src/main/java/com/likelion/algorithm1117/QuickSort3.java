package com.likelion.algorithm1117;

import com.likelion.algorithm1115.QuickSort2;

import java.util.Arrays;

public class QuickSort3 {

    private int[] sort(int[] ints, int leftIdx, int rightIdx) {

//        int leftIdx = 0;
//        int rightIdx = ints.length-1;
        int pivotIdx = (leftIdx+rightIdx+1)/2;

        // pivot을 기준으로 left index의 값과 right index의 값을 바꾼다

        // leftIdx <= rightIdx 일 동안 교환을 함
        // 같을 때 왜 교환을 해야하지?
        // 교환을 하지 않으면 두 가지가 동일한 위치에 있는지에 대해 검사하는 과정을 거쳐야 하는데
        // 이 때의 비용이 더 많이 든다

        while (leftIdx <= rightIdx){
            if(ints[leftIdx] < ints[pivotIdx]){
                leftIdx++;
            } else if (ints[pivotIdx] < ints[rightIdx]) {
                rightIdx--;
            } else{
                int temp = ints[leftIdx];
                ints[leftIdx] = ints[rightIdx];
                ints[rightIdx] = temp;
                leftIdx++;
                rightIdx--;
            }

        }

        return ints;
    }




    public static void main(String[] args) {

        QuickSort3 quickSort3 = new QuickSort3();
        System.out.println(Arrays.toString(quickSort3.sort(new int[]{20, 18, 5, 19, 40, 50, 5, 25}, 0, 7)));
        System.out.println(Arrays.toString(quickSort3.sort(new int[]{20, 60, 5, 19, 40, 50, 5, 45}, 0, 7)));

    }


}

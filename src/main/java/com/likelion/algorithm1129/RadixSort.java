package com.likelion.algorithm1129;

import java.util.Arrays;

public class RadixSort {

    int[] radixSort(int[] inputs){
        // int[]의 개수는 값의 range가 무엇인지 알아야 배열할 수 있음

        int max = inputs[0];
        int min = inputs[0];

        for (int num: inputs) {
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }

        int range = max - min + 1;

        int[] indexArray = new int[range];
        int[] result = new int[inputs.length];

        Arrays.fill(indexArray, min-1);

        for (int input: inputs) {
            indexArray[input-min] = input;
        }

        int index = 0;

        for (int num: indexArray) {
            if(num > min-1){
                result[index] = num;
                index++;
            }

        }

        return result;
    }


    public static void main(String[] args) {

        RadixSort radixSort = new RadixSort();
        System.out.println(Arrays.toString(radixSort.radixSort(new int[]{7,4,5,9,1,0})));
        System.out.println(Arrays.toString(radixSort.radixSort(new int[]{7,4,5,9,1,0,10,-2})));

    }
}

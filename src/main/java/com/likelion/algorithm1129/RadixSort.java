package com.likelion.algorithm1129;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class RadixSort {

    int[] radixSortOfOneDigit(int[] inputs){
        // 한 자리 수 -> 0에서 9까지 10개의 자리가 필요함

        int[] indexArray = new int[10];
        int[] result = new int[inputs.length];

        Arrays.fill(indexArray, -1);

        for (int input: inputs) {
            indexArray[input] = input;
        }

        int index = 0;

        for (int num: indexArray) {
            if(num > -1){
                result[index] = num;
                index++;
            }

        }

        return result;
    }


    Set<Integer> calculateDigits(int[] inputs){
        // N 자리 수
        // 1의 자리로 배열 -> 10의 자리수로 배열 -> ... -> 10^(n-1)의 자리수로 배열
        // 최댓값의 자리수 구하기

        Set<Integer> digits = new HashSet<>();

        for (int i = 0; i < inputs.length; i++) {
            if(inputs[i] == 0) {
                digits.add(1);
            } else if (inputs[i] < 0) {
                continue;
            } else{
                digits.add((int) (Math.floor(Math.log10(inputs[i])) + 1));
            }

        }

        return digits;
    }


    public static void main(String[] args) {

        RadixSort radixSort = new RadixSort();
        // 0이상의 정수에서만 사용할 수 있음
        System.out.println(Arrays.toString(radixSort.radixSortOfOneDigit(new int[]{7,4,5,9,1,0})));
        System.out.println(radixSort.calculateDigits(new int[]{7,4,5,9,1,0,10,12,16,15,255,0,5,1654}));

    }
}

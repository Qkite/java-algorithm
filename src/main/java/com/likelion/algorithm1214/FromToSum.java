package com.likelion.algorithm1214;

import java.util.Arrays;

public class FromToSum {

    // 2중(3중) 반복문
    
    int[][] fromToSum1(int[] input){
        
        int[][] result = new int[input.length][input.length];

        for (int i = 0; i < result.length; i++) {
            for (int j = i; j < result.length; j++) {

                result[i][j] = Arrays.stream(Arrays.copyOfRange(input, i, j+1)).sum();

            }

        }

        
        return result;
    }

    // 배열에 기록하기

    int[][] fromToSum2(int[] input){

        int[][] result = new int[input.length][input.length];

        // 0-0,1-1,2-2
        // 0-1,1-2
        // 0-2

        // 첫째줄
        for (int i = 0; i < input.length; i++) {
            result[i][i] = input[i];
        }

        // 둘째줄
        for (int i = 0; i < input.length-1; i++) {
            result[i][i+1] = result[i][i] + result[i+1][i+1];

        }


        return result;
    }

    public static void main(String[] args) {

        FromToSum fromToSum = new FromToSum();
        System.out.println(Arrays.deepToString(fromToSum.fromToSum1(new int[]{1, 3, 5, 4, 6, 7})));
        System.out.println(Arrays.deepToString(fromToSum.fromToSum2(new int[]{1, 3, 5, 4, 6, 7})));
        
    }
}

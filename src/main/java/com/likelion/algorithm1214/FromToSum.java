package com.likelion.algorithm1214;

import java.util.Arrays;

public class FromToSum {
    
    int[][] fromToSum(int[] input){
        
        int[][] result = new int[input.length][input.length];

        for (int i = 0; i < result.length; i++) {
            for (int j = i; j < result.length; j++) {

                result[i][j] = Arrays.stream(Arrays.copyOfRange(input, i, j+1)).sum();

            }

        }

        
        return result;
    }

    public static void main(String[] args) {

        FromToSum fromToSum = new FromToSum();
        System.out.println(Arrays.deepToString(fromToSum.fromToSum(new int[]{1, 3, 5, 4, 6, 7})));
        
    }
}

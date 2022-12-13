package com.likelion.algorithm1213;

import java.util.Arrays;

public class OptimalStrategy2 {

    int[][] sumOfCoins(int[] coins){

        int[][] sumArray = new int[coins.length][coins.length];

        for (int i = 0; i < coins.length; i++) {
            sumArray[i][i] = coins[i];
        }

        /*

        for (int i = 0; i < coins.length-1; i++) {
            sumArray[i][i+1] = sumArray[i][i] + sumArray[i+1][i+1];

        }

        for (int i = 0; i < coins.length-2; i++) {
            sumArray[i][i+2] = sumArray[i][i+1] + sumArray[i+1][i+2];

        }

        for (int i = 0; i < coins.length-3; i++) {
            sumArray[i][i+3] = sumArray[i][i+2] + sumArray[i+1][i+3];

        }
        */


        for (int i = 1; i < coins.length; i++) {
            for (int j = 0; j < coins.length-i; j++) {
                sumArray[j][j+i] = sumArray[j][j+i] + sumArray[j+1][j+i];

            }
        }


        System.out.println(Arrays.deepToString(sumArray));

        return sumArray;


    }

    public static void main(String[] args) {
        OptimalStrategy2 optimalStrategy2 = new OptimalStrategy2();
        int[] coins = new int[]{2,7,40,19};
        System.out.println(Arrays.deepToString(optimalStrategy2.sumOfCoins(coins)));

    }
}

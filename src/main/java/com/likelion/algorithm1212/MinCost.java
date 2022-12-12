package com.likelion.algorithm1212;

import java.util.Arrays;

public class MinCost {

    int getMinCost(int[][] matrix){

        int[][] result = new int[matrix.length][matrix[0].length];

        System.out.println("input: " + Arrays.deepToString(matrix));

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

        return result[matrix.length-1][matrix[0].length-1];


    }

    public static void main(String[] args) {

        MinCost minCost = new MinCost();
        minCost.getMinCost(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        minCost.getMinCost(new int[][]{{1,2,3}});
        minCost.getMinCost(new int[][]{{1},{4},{7}});
        minCost.getMinCost(new int[][]{{1,2},{4,5},{7,8}});




    }
}

package com.likelion.algorithm1212;

import java.util.Arrays;

public class MinCost {

    int getMinCost(int[][] matrix){
        int rowNum = matrix.length;
        int colNum = matrix[0].length;

        int[][] result = new int[rowNum][colNum];

        System.out.println("input: " + Arrays.deepToString(matrix));

//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(result[i]));
//        }

        
        // 첫째 칸
        result[0][0] = matrix[0][0];

        // 첫째 열
        for (int i = 1; i < rowNum; i++) {
            result[i][0] = result[i-1][0] + matrix[i][0];
        }

        // 첫째 행
        for (int i = 1; i < colNum; i++) {
            result[0][i] = result[0][i-1] + matrix[0][i];
        }




        for (int i = 1; i < rowNum; i++) {
            for (int j = 1; j < colNum; j++) {

                result[i][j] = Math.min(result[i-1][j-1], Math.min(result[i-1][j], result[i][j-1])) + matrix[i][j];

            }
        }

        System.out.println(Arrays.deepToString(result));



        return result[matrix.length-1][matrix[0].length-1];


    }

    public static void main(String[] args) {

        MinCost minCost = new MinCost();
        System.out.println(minCost.getMinCost(new int[][]{{1,3,2},{4,6,2},{1,2,4}}));
        System.out.println(minCost.getMinCost(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        System.out.println(minCost.getMinCost(new int[][]{{1}}));
        System.out.println(minCost.getMinCost(new int[][]{{1,2,3}}));
        System.out.println(minCost.getMinCost(new int[][]{{1},{4},{7}}));
        System.out.println(minCost.getMinCost(new int[][]{{1,2},{4,5},{7,8}}));




    }
}

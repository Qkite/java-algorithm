package com.likelion.algorithm1214;

import java.util.Arrays;

class Pair<L, R>{
    L left;
    R right;

    Pair(L left, R right){
        this.left = left;
        this.right = right;
    }

}

public class OptimalStrategy3 {

    Pair[][] leftAndRight(int[] input){
        Pair[][] arr = new Pair[input.length][input.length];

        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                int[] newArr = Arrays.copyOfRange(input, i, j + 1);
                arr[i][j] = new Pair(newArr[0], newArr[newArr.length-1]);


            }
        }

        return arr;

    }




    public static void main(String[] args) {

        OptimalStrategy3 optimalStrategy3 = new OptimalStrategy3();

        Pair[][] result = optimalStrategy3.leftAndRight(new int[]{2, 7, 40, 19});

        for (int i = 0; i < result.length; i++) {
            for (int j = i; j < result.length ; j++) {
                System.out.printf("%d %d left: %d, right: %d\n", i, j, result[i][j].left, result[i][j].right);
            }

        }

    }
}

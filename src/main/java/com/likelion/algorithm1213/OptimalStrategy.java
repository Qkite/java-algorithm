package com.likelion.algorithm1213;

import java.util.Arrays;

class Pair<L, R>{
    L left;
    R right;


    Pair(L left, R right){
        this.left = left;
        this.right = right;
    }
}

public class OptimalStrategy {

    public Pair[][] optimalStrategy(int[] input){

        Pair[][] result = new Pair[input.length][input.length];

        for (int i = 0; i < input.length; i++) {
            result[i][i] = new Pair(input[i], 0);
        }

        for (int i = 0; i < result.length; i++) {

            System.out.printf("%d %d, left: %d, right: %d \n", i, i, result[i][i].left, result[i][i].right);

        }

        return result;

    }



    public static void main(String[] args) {

        OptimalStrategy optimalStrategy = new OptimalStrategy();
        optimalStrategy.optimalStrategy(new int[]{2,7,40,19});

    }




}

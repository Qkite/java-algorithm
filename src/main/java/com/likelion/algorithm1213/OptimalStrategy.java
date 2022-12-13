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

        // 1개 씩만 있는 경우

        for (int i = 0; i < input.length; i++) {
            result[i][i] = new Pair(input[i], 0);
        }

        // 2개가 있는 경우

        for (int i = 0; i < input.length-1; i++) {
            int left1 = input[i];
            int left2 = input[i+1];
            if(left1>= left2){
                result[i][i+1] = new Pair(input[i], input[i+1]);
            } else{
                result[i][i+1] = new Pair(input[i+1], input[i]);
            }


        }



        for (int i = 0; i < result.length; i++) {

            System.out.printf("%d %d, left: %d, right: %d \n", i, i, result[i][i].left, result[i][i].right);


        }

        for (int i = 0; i < result.length-1; i++) {
            System.out.printf("%d %d, left: %d, right: %d \n", i, i+1, result[i][i+1].left, result[i][i+1].right);
        }

        return result;

    }



    public static void main(String[] args) {

        OptimalStrategy optimalStrategy = new OptimalStrategy();
        optimalStrategy.optimalStrategy(new int[]{2,7,40,19});

    }




}

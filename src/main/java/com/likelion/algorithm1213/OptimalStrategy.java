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

        // 3개가 있는 경우

        for (int i = 0; i < input.length-2; i++) {
            int left1 = input[i] + (int)result[i+1][i+2].right;
            int left2 = input[i+2] + (int)result[i][i+1].right;

            if(left1>= left2){
                result[i][i+2] = new Pair(left1,(int)result[i+1][i+2].left);
            } else{
                result[i][i+2] = new Pair(left2, (int)result[i][i+1].left);
            }

        }

        // 4개가 있는 경우 -> 다시 하기

        for (int i = 0; i < input.length-3; i++) {
            int left1 = input[i] + (int)result[i][i+2].right;
            int left2 = input[i+3] + (int)result[i+1][i+3].right;

            if(left1>= left2){
                result[i][i+3] = new Pair(left1,(int)result[i+1][i+3].left);
            } else{
                result[i][i+3] = new Pair(left2, (int)result[i][i+2].left);
            }

        }





        for (int i = 0; i < result.length; i++) {
            for (int j = i; j < result.length; j++) {
                System.out.printf("%d %d, left: %d, right: %d \n", i, j, result[i][j].left, result[i][j].right);
            }

        }


        return result;

    }



    public static void main(String[] args) {

        OptimalStrategy optimalStrategy = new OptimalStrategy();
        optimalStrategy.optimalStrategy(new int[]{2,7,40,19});

    }




}

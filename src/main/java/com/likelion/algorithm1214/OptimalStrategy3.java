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

    Pair[][] optimalSelect(int[] input){
        Pair[][] arr = new Pair[input.length][input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i][i] = new Pair(input[i], 0);
        }


        for (int i = 0; i < input.length-1; i++) {
            arr[i][i+1] = new Pair(Math.max(input[i], input[i+1]), Math.min(input[i], input[i+1]));
        }

        for (int i = 2; i < input.length; i++) {
            for (int j = 0; j < input.length-i; j++) {
                int num1 = input[j] + (int) arr[j+1][j+i].right;
                int num2 = input[j+i] + (int) arr[j][j+i-1].right;

                if(num1 >= num2){
                    arr[j][j+i] = new Pair(num1, (int) arr[j+1][j+i].left);
                } else{
                    arr[j][j+i] = new Pair(num2, (int) arr[j][j+i-1].left);
                }



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

        Pair[][] result1 = optimalStrategy3.optimalSelect(new int[]{2, 7, 40, 19});

        for (int i = 0; i < result1.length; i++) {
            for (int j = i; j < result1.length ; j++) {
                System.out.printf("%d %d left: %d, right: %d\n", i, j, result1[i][j].left, result1[i][j].right);
            }

        }

    }
}

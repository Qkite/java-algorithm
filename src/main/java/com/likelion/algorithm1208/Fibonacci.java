package com.likelion.algorithm1208;

import java.util.Arrays;

public class Fibonacci {

    int[] fibonacci(int nth, int[] arr){

        if(nth == 1){
            arr[0] = 1;
        } else if (nth == 2){
            arr[0] = 1;
            arr[1] = 1;
        } else{
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < nth; i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }


        return arr;
    }



    public static void main(String[] args) {
        int num = 20;

        Fibonacci fibonacci = new Fibonacci();

        System.out.println(Arrays.toString(fibonacci.fibonacci(num, new int[num])));

    }
}

package com.likelion.algorithm1208;

import java.util.Arrays;

public class Fibonacci {

    int fibonacci(int nth, int[] arr){

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

        System.out.println(arr);

        // return arr; -> 수열 전체를 print


        return arr[nth-1];
    }



    public static void main(String[] args) {
        int num = 20;

        Fibonacci fibonacci = new Fibonacci();

        System.out.println(fibonacci.fibonacci(num, new int[num]));

    }
}

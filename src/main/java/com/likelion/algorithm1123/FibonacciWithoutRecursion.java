package com.likelion.algorithm1123;

public class FibonacciWithoutRecursion {

    public int fibonacci(int num){

        int[] array = new int[num];

        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < num; i++) {
            array[i] = array[i-1] + array[i-2];
        }

        return array[num-1];
    }

    public static void main(String[] args) {

        FibonacciWithoutRecursion fibonacciWithoutRecursion = new FibonacciWithoutRecursion();
        System.out.println(fibonacciWithoutRecursion.fibonacci(5));
        System.out.println(fibonacciWithoutRecursion.fibonacci(7));
        // 1 1 2 3 5 8 13

    }
}

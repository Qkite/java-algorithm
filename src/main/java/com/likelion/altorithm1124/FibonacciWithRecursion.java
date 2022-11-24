package com.likelion.altorithm1124;

public class FibonacciWithRecursion {

    int fibonacci(int num){

        if(num == 1){
            return 1;
        } else if (num==2) {
            return 1;
        } else{
            return fibonacci(num-1) + fibonacci(num-2);
        }

    }


    public static void main(String[] args) {

        FibonacciWithRecursion fibonacci = new FibonacciWithRecursion();
        System.out.println(fibonacci.fibonacci(30));

    }
}

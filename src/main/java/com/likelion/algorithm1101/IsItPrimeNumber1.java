package com.likelion.algorithm1101;


public class IsItPrimeNumber1 {

    // boolean 식으로 for loop에도 특정 조건을 넣어줄 수 있다
    boolean someOperation(int a, int b){
        return a<b;
    }

    boolean isPrime(int num){


        for (int i = 2; someOperation(i, num); i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsItPrimeNumber1 isItPrimeNumber1 = new IsItPrimeNumber1();
        System.out.println(isItPrimeNumber1.isPrime(13));
        System.out.println(isItPrimeNumber1.isPrime(25));
    }


}

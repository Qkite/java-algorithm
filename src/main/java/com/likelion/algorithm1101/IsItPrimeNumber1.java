package com.likelion.algorithm1101;

interface StatementStrategy{
    boolean compare(int a, int b);
}

public class IsItPrimeNumber1 {

    // boolean 식으로 for loop에도 특정 조건을 넣어줄 수 있다


    boolean isPrime(int num, StatementStrategy stmt){
        for (int i = 2; stmt.compare(i, num); i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        IsItPrimeNumber1 isItPrimeNumber1 = new IsItPrimeNumber1();
        System.out.println(isItPrimeNumber1.isPrime(13, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a<b;
            }
        }));
        System.out.println(isItPrimeNumber1.isPrime(25, (a,b) -> a<b/2));
        System.out.println(isItPrimeNumber1.isPrime(37, (a,b) -> a*a<b/2));

    }


}

package com.likelion.algorithm1130;

public class SumOfDivisor {

    public int solution(int num){
        int sum=0;

        for (int i = 1; i <= num ; i++) {

            if(num % i == 0){
                sum += i;
            }

        }

        return sum;

    }

    public static void main(String[] args) {

        SumOfDivisor sumOfDivisor = new SumOfDivisor();
        System.out.println(sumOfDivisor.solution(12));

    }




}

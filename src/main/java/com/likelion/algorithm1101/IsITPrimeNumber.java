package com.likelion.algorithm1101;

public class IsITPrimeNumber {

    public boolean solution(int input) {
        boolean answer=true;

        for (int i = 2; i < input; i++) {
            if(input % i == 0){
                answer = false;
            }
        }


        return answer;
    }
}

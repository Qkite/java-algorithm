package com.likelion.algorithm1101;

public class IsITPrimeNumber {

    public boolean solution1(int input) {
        boolean answer=true;

        // 2부터 n-1까지
        for (int i = 2; i < input; i++) {
            if(input % i == 0){
                answer = false;
            }
        }

        return answer;
    }

    public boolean solution2(int input) {
        boolean answer=true;

        // 2부터 루트 n 까지
        for (int i = 2; i < Math.ceil(Math.pow(input, 0.5)); i++) {
            if(input % i == 0){
                answer = false;
            }
        }

        return answer;
    }

    public boolean solution3(int input) {
        boolean answer=true;

        // 2부터 루트 n 까지
        for (int i = 2; i < input/2; i++) {
            if(input % i == 0){
                answer = false;
            }
        }

        return answer;
    }


}

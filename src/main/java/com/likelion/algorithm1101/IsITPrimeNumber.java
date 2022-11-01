package com.likelion.algorithm1101;

interface InsertCondition {
    public int insertCondition();
}

class PrimeNumberCalculation{

    boolean solution(int input, int condition) {


        boolean answer=true;

        // 2부터 n-1까지
        for (int i = 2; i <= condition; i++) {
            if(input % i == 0){
                answer = false;
            }
        }

        return answer;
    }

    private InsertCondition insertToLoop(int condition) {

        return new InsertCondition() {
            @Override
            public int insertCondition() {

                return condition;
            }
        };

    }


}

public class IsITPrimeNumber {



    public boolean solution1(int input) {
        PrimeNumberCalculation primeNumberCalculation = new PrimeNumberCalculation();
        boolean answer = primeNumberCalculation.solution(input, input-1);
        return answer;
    }

    public boolean solution2(int input) {
        PrimeNumberCalculation primeNumberCalculation = new PrimeNumberCalculation();
        boolean answer = primeNumberCalculation.solution(input, (int) Math.ceil(Math.pow(input, 0.5)));
        return answer;
    }

    public boolean solution3(int input) {
        PrimeNumberCalculation primeNumberCalculation = new PrimeNumberCalculation();
        boolean answer = primeNumberCalculation.solution(input, input/2);
        return answer;
    }

//
//    // 에라토스테네스의 체
//    public boolean solution4(int input){
//
//    }


}

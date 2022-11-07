package com.likelion.algorithm1107;

public class HarshardNum {

    public boolean solution(int x) {
        boolean answer = true;
        int inputNum = x;
        int sum=0;


        // 1. 자릿수: String으로 치환해서 풀기
        //  2. 나머지 연산으로 풀기

        while(x >= 10){
            sum += x%10;
            x /= 10;
        }
        sum += x;



        if (inputNum%sum!=0 ){
            answer = false;
        }

        return answer;
    }


    public static void main(String[] args) {

        HarshardNum harshardNum = new HarshardNum();
        System.out.println(harshardNum.solution(10));
        System.out.println(harshardNum.solution(12));
        System.out.println(harshardNum.solution(11));
        System.out.println(harshardNum.solution(13));

    }
}

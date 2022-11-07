package com.likelion.algorithm1107;

public class HarshardNum {

    public boolean solution1(int x){
        boolean answer = true;
        int inputNum = x;
        int sum=0;

        // 1. 자릿수: String으로 치환해서 풀기

        String stringNum = String.valueOf(x);
        for (int i = 0; i < stringNum.length(); i++) {
           sum += Integer.parseInt(String.valueOf(stringNum.charAt(i)));

        }

        if (inputNum%sum!=0 ){
            answer = false;
        }

        return answer;

    }

    public boolean solution2(int x) {
        boolean answer = true;
        int inputNum = x;
        int sum=0;

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

        System.out.println(harshardNum.solution1(10));
        System.out.println(harshardNum.solution1(12));
        System.out.println(harshardNum.solution1(11));
        System.out.println(harshardNum.solution1(13));

        System.out.println(harshardNum.solution2(10));
        System.out.println(harshardNum.solution2(12));
        System.out.println(harshardNum.solution2(11));
        System.out.println(harshardNum.solution2(13));

    }
}

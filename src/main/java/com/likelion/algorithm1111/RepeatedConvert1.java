package com.likelion.algorithm1111;


import java.util.Arrays;


public class RepeatedConvert1 {
    public int[] solution(String s) {

        int[] answer = new int[2];

        int countOfZero = 0;
        int iter = 0;

        while(s.length() >= 2){
            countOfZero += s.length() - s.replace("0","").length();
            s = Integer.toBinaryString(s.replace("0","").length());
            iter++;
        }

        answer[0] = iter;
        answer[1] = countOfZero;

        return answer;
    }


    public static void main(String[] args) {
        RepeatedConvert1 repeatedConvert = new RepeatedConvert1();
        System.out.println(Arrays.toString(repeatedConvert.solution("110010101001")));
        System.out.println(Arrays.toString(repeatedConvert.solution("01110")));

        System.out.println("01110".substring(0,1) instanceof String);
        System.out.println(Arrays.toString(repeatedConvert.solution("11111111")));
    }

}

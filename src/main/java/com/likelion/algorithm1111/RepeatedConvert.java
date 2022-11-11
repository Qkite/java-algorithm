package com.likelion.algorithm1111;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 이진수로 변환했을 때 1의 개수가 문자열의 길이
// 0의 개수를 배열에 추가함
// 들어온 문자열이 이진수 -> 십진수로 변환
// 앞에 0이 있는 경우...는 countOfZero++ 해주기
// 문자열을 비교할 때는 equals를 반드시 사용하기
// while문 2번 -> 런타임 에러 발생
// 문자열 그대로 이용하는 방향으로
public class RepeatedConvert {
    public int[] solution(String s) {

        long num = Long.parseLong(s, 2);
        int[] answer = new int[2];

        int countOfZero = 0;
        int iter = 0;

        while(s.substring(0,1).equals("0")){
            s = s.substring(1);
            countOfZero++;
            System.out.println("hello");
        }

        System.out.println(countOfZero);

        while (num >= 2){
            iter++;

            int countOfOne = 0;
            while(num >0){
                if(num % 2 == 0){
                    countOfZero++;
                } else{
                    countOfOne++;
                }
                num /= 2;
            }

            num = countOfOne;
        }


        answer[0] = iter;
        answer[1] = countOfZero;

        return answer;
    }


    public static void main(String[] args) {
        RepeatedConvert repeatedConvert = new RepeatedConvert();
        System.out.println(Arrays.toString(repeatedConvert.solution("110010101001")));
        System.out.println(Arrays.toString(repeatedConvert.solution("01110")));

        System.out.println("01110".substring(0,1) instanceof String);
        System.out.println(Arrays.toString(repeatedConvert.solution("11111111")));
    }

}

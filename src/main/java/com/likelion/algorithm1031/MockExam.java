package com.likelion.algorithm1031;

import java.util.ArrayList;

public class MockExam {

    /*
    1번: 5번씩 반복
    2번: 8번씩 반복
    3번: 10번씩 반복
    --> 나머지를 이용? 최소 공배수가 140
    --> 최대 10000개 array 만들어서 그냥 진행해보기
     */

    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] count = new int[3];

        // 10000

        String[] answer1 = "1,2,3,4,5".repeat(10000/5).split(",");
        String[] answer2 = "2,1,2,3,2,4,2,5".repeat(10000/8).split(",");
        String[] answer3 = "3,3,1,1,2,2,4,4,5,5".repeat(10000/10).split(",");

        for (int i = 0; i < answer.length; i++) {
            if(answer1[i].equals(answer[i])){
                count[0]++ ;
            }
            if(answer2[i].equals(answer[i])){
                count[1]++;
            }
            if(answer3[i].equals(answer[i])){
                count[2]++;
            }
        }
        int maxNum = Math.max(Math.max(count[0],count[1]),count[2]);
        String answerString = "";

        if(maxNum <= count[0]){
            answerString += "1";
        }
        if(maxNum <= count[1]){
            answerString += "2";
        }
        if(maxNum<= count[1]){
            answerString += "3";
        }

        for (int i = 0; i < answerString.length(); i++) {
            answer[i] = Integer.parseInt(String.valueOf(answerString.charAt(i)));
        }

        return answer;
    }
}

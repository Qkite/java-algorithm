package com.likelion.algorithm1031;

import java.util.*;

public class MockExam {

    /*
    1번: 5번씩 반복
    2번: 8번씩 반복
    3번: 10번씩 반복
    --> 나머지를 이용? 최소 공배수가 40
    --> 최대 10000개 array 만들어서 그냥 진행해보기
     */

    public int[] solution(int[] answers) {

        int[] count = new int[3];


        String[] answer1 = "1,2,3,4,5,".repeat(10000/5).split(",");
        String[] answer2 = "2,1,2,3,2,4,2,5,".repeat(10000/8).split(",");
        String[] answer3 = "3,3,1,1,2,2,4,4,5,5,".repeat(10000/10).split(",");


        for (int i = 0; i < answers.length; i++) {
            if(Integer.parseInt(answer1[i]) == answers[i]){
                count[0]++ ;
            }
            if(Integer.parseInt(answer2[i]) ==answers[i]){
                count[1]++ ;
            }
            if(Integer.parseInt(answer3[i]) ==answers[i]){
                count[2]++ ;
            }
        }

        int maxNum = Math.max(Math.max(count[0],count[1]),count[2]);


        String answerString = "";

        if(maxNum == count[0]){
            answerString += "1";
        }
        if(maxNum == count[1]){
            answerString += "2";
        }
        if(maxNum == count[2]){
            answerString += "3";
        }

        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < answerString.length(); i++) {
            list1.add(Character.getNumericValue(answerString.charAt(i)));
        }

        int[] answer = new int[list1.size()];

        for (int i = 0; i < list1.size(); i++) {
            answer[i] = list1.get(i);
        }


        System.out.println(Arrays.toString(answer));

        return answer;
    }
}

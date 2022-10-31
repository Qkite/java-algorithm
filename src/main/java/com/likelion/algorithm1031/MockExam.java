package com.likelion.algorithm1031;

public class MockExam {

    /*
    1번: 5번씩 반복
    2번: 8번씩 반복
    3번: 10번씩 반복
    --> 나머지를 이용? 최소 공배수가 140
    --> 최대 10000개 array 만들어서 그냥 진행해보기
     */

    public int[] solution(int[] answers) {
        int[] answer = {};
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        // 10000

        String[] answer1 = "1,2,3,4,5".repeat(10000/5).split(",");
        String[] answer2 = "2,1,2,3,2,4,2,5".repeat(10000/5).split(",")

        for (int i = 0; i < answer.length; i++) {



        }


        return answer;
    }
}

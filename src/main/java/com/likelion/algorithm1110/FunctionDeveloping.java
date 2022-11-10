package com.likelion.algorithm1110;

import java.util.ArrayList;
import java.util.List;


public class FunctionDeveloping {

    public List<Integer> solution(int[] progresses, int[] speeds) {

        int[] remainDays = new int[progresses.length];
        List<Integer> solution = new ArrayList<>();

        if((100 - progresses[0])%speeds[0] == 0){
            remainDays[0] = (100 - progresses[0])/speeds[0];
        } else{
            remainDays[0] = (100 - progresses[0])/speeds[0] +1;
        }


        int count = 1;

        for (int i = 1; i < progresses.length; i++) {

            if((100 - progresses[i])%speeds[i] == 0){
                remainDays[i] = (100 - progresses[i])/speeds[i];
            } else{
                remainDays[i] = (100 - progresses[i])/speeds[i] +1;
            }

            if(remainDays[i] <= remainDays[i-1]){
                count ++;
                remainDays[i] = remainDays[i-1];
            } else{
                solution.add(count);
                count = 1;

            }

        }

        solution.add(count);

        return solution;
    }

    public static void main(String[] args) {
        FunctionDeveloping functionDeveloping = new FunctionDeveloping();
        System.out.println(functionDeveloping.solution(new int[] {93,30,55}, new int[]{1,30,5}));
        System.out.println(functionDeveloping.solution(new int[] {99,98,97,80,96,95,80}, new int[]{2,2,1,5,30,5,10}));
        // remainDays[i] = remainDays[i-1];
        // 이걸 안해주면 바로 직전과만 비교 -> [2,1,1,3]으로 나옴
    }
}

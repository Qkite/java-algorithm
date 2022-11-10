package com.likelion.algorithm1110;

import java.util.Stack;

public class NotWandDuplicatedNumWithStack {

    public Stack<Integer> solution(int[] arr){

        Stack<Integer> answer = new Stack<>();
        answer.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(answer.peek() == arr[i]){
                continue;
            } else{
                answer.push(arr[i]);
            }

        }

        return answer;

    }

    public static void main(String[] args) {

        NotWandDuplicatedNumWithStack notWandDuplicatedNumWithStack = new NotWandDuplicatedNumWithStack();
        System.out.println(notWandDuplicatedNumWithStack.solution(new int[] {1,3,5,4,4,1,6,5,1,3,2,1,1,2,2}));

    }
}

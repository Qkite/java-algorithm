package com.likelion.algorithm1110;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FunctionDevelopingWithStack {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        if ((100 - progresses[0]) % speeds[0] == 0) {
            stack.push((100 - progresses[0]) / speeds[0]);
        } else {
            stack.push((100 - progresses[0]) / speeds[0] + 1);
        }

        int value = 0;
        int count = 1;

        for (int i = 1; i < progresses.length; i++) {

            if ((100 - progresses[i]) % speeds[i] == 0) {
                value = (100 - progresses[i]) / speeds[i];
            } else {
                value = (100 - progresses[i]) / speeds[i] + 1;
            }

            if (stack.peek() >= value) {
                count++;
            } else {
                stack.push(value);
                answer.add(count);
                count = 1;
            }
        }
        answer.add(count);

        return answer;
    }

    public static void main(String[] args) {
        FunctionDevelopingWithStack functionDevelopingWithStack = new FunctionDevelopingWithStack();
        System.out.println(functionDevelopingWithStack.solution(new int[] {93,30,55}, new int[]{1,30,5}));
        System.out.println(functionDevelopingWithStack.solution(new int[] {99,98,97,80,96,95,80}, new int[]{2,2,1,5,30,5,10}));

    }
}


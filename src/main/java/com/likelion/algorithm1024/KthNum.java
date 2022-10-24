package com.likelion.algorithm1024;

import java.util.Arrays;

public class KthNum {

    public int[] solution(int[] array, int[][] commands){
        int commandLength = commands.length;
        int[] answer = new int[commandLength]; // command가 50이하

        int idx = 0;

        for (int[] command: commands) {
            int[] arr1  = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(arr1);
            answer[idx] = arr1[command[2]-1]; //Index 0 out of bounds for length 0
            idx++;
        }

        return answer;
    }

    // array 자르기: Arrays.copyOfRange(array, from, to)


    public static void main(String[] args) {
        int[] arr = {1,5,2,6,3,7,4};
        int[][] coms = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        KthNum kthNum = new KthNum();

        System.out.println(kthNum.solution(arr, coms));

    }
}

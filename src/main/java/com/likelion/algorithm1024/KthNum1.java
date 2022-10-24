package com.likelion.algorithm1024;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthNum1 {
    // 우선순위 큐를 이용한 K번째 수
    public int[] solution(int[] array, int[][] commands){
        

        int commandLength = commands.length;
        int[] answer = new int[commandLength]; // command가 50이하

        int idx = 0;

        for (int[] command: commands) {

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int[] arr1  = Arrays.copyOfRange(array, command[0]-1, command[1]);

            for (int i = 0; i < arr1.length; i++) {

                pq.add(arr1[i]);
            }

            for (int i = 0; i < command[2]-1; i++) {
                pq.poll();
            }

            answer[idx] = pq.element(); //Index 0 out of bounds for length 0
            idx++;
        }

        return answer;
    }

    // array 자르기: Arrays.copyOfRange(array, from, to)


    public static void main(String[] args) {
        int[] arr = {1,5,2,6,3,7,4};
        int[][] coms = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        KthNum1 kthNum = new KthNum1();

        System.out.println(Arrays.toString(kthNum.solution(arr, coms)));

    }
}

package com.likelion.algorithm1107;

import java.util.*;

public class MakeArrWithDivisor {

    public List<Integer> solution1(int[] arr, int divisor) {

        List<Integer> answer = new ArrayList<>();

        for (int num:arr) {
            if(num %divisor == 0){
                answer.add(num);
            }
        }

        if(answer.size() == 0){
            answer.add(-1);
        }

        Collections.sort(answer);

        return answer;
    }

    public int[] solution2(int[] arr, int divisor) {

        int[] answer = new int[arr.length];
        int index=0;

        for (int num:arr) {
            if(num %divisor == 0){
                answer[index] = num;
                index++;
            }
        }

        int[] answer1 = new int[index];
        int index1 = 0;

        for (int num1:answer) {
            if(num1>0){
                answer1[index1] = num1;
                index1++;
            }
        }

        if(answer1.length == 0){
            answer1 = new int[] {-1};
        }

        Arrays.sort(answer1);

        return answer1;
    }

    public PriorityQueue<Integer> solution3(int[] arr, int divisor) {

        PriorityQueue<Integer> answer = new PriorityQueue<>();

        for (int num:arr) {
            if(num %divisor == 0){
                answer.add(num);
            }
        }

        if(answer.size() == 0){
            answer.add(-1);
        }


        return answer;
    }



    public static void main(String[] args) {
       MakeArrWithDivisor makeArrWithDivisor = new MakeArrWithDivisor();
       System.out.println(makeArrWithDivisor.solution1(new int[]{5,9,7,10}, 5));
       System.out.println(makeArrWithDivisor.solution1(new int[]{2,36,1,3}, 1));
       System.out.println(makeArrWithDivisor.solution1(new int[]{3,2,6}, 10));

       System.out.println(Arrays.toString(makeArrWithDivisor.solution2(new int[]{5, 9, 7, 10}, 5)));
       System.out.println(Arrays.toString(makeArrWithDivisor.solution2(new int[]{2, 36, 1, 3}, 1)));
       System.out.println(Arrays.toString(makeArrWithDivisor.solution2(new int[]{3, 2, 6}, 10)));

        System.out.println(makeArrWithDivisor.solution3(new int[]{5, 9, 7, 10}, 5));
        System.out.println(makeArrWithDivisor.solution3(new int[]{2, 36, 1, 3}, 1));
        System.out.println(makeArrWithDivisor.solution3(new int[]{3, 2, 6}, 10));



    }

}

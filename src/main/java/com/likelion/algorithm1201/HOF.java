package com.likelion.algorithm1201;

import java.util.*;

public class HOF {

    int[] selectKNumWithPriorityQueue(int k, int[] score){
        Queue<Integer> integerQueue = new PriorityQueue<>();
        int[] minScores = new int[score.length];
        int idx = 0;

        for (int i = 0; i < score.length; i++) {

            if(integerQueue.size() < k){
                integerQueue.add(score[i]);
                int dd = integerQueue.peek();
                System.out.println(integerQueue +"1");
                System.out.printf("%d %d\n", idx, dd);
                minScores[idx] = dd;
                idx++;
            } else{
                if(integerQueue.peek() < score[i]){
                    integerQueue.poll();
                    integerQueue.add(score[i]);
                    int dd = integerQueue.peek();
                    // 제거한 후 새로 들어온 것 중에서 최솟값을 구해줘야함
                    minScores[idx] = dd;


                    System.out.println(integerQueue + "2");
                    System.out.printf("%d %d\n", idx, dd);
                    idx++;
                } else{
                    int dd =integerQueue.peek();
                    minScores[idx] = dd;
                    System.out.println(integerQueue + "3");
                    System.out.printf("%d %d\n", idx, dd);

                    idx++;
                }
            }
        }

        return minScores;

    }

    int[] selectKNumWithList(int k, int[] input){
        int[] minScores = new int[input.length];
        List<Integer> integerList = new ArrayList<>();

        int minValue = input[0];
        for (int i = 0; i < input.length; i++) {


            if(integerList.size() < k){
                integerList.add(input[i]);
                minValue = minValue > input[i] ? input[i]:minValue;

            } else{
                if(minValue > input[i]){

                    int minIdx = integerList.indexOf(minValue);
                    integerList.remove(minIdx);
                    integerList.add(input[0]);

                    Collections.sort(integerList);

                    minValue = integerList.get(0);

                }
            }

            minScores[i] = minValue;
        }

        return minScores;

    }







    public static void main(String[] args) {

        HOF hof = new HOF();
        System.out.println(Arrays.toString(hof.selectKNumWithPriorityQueue(3, new int[]{10,100,20,150,1,100,200})));

        System.out.println(Arrays.toString(hof.selectKNumWithPriorityQueue(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));

        System.out.println(Arrays.toString(hof.selectKNumWithList(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
        System.out.println(Arrays.toString(hof.selectKNumWithList(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));


    }

}

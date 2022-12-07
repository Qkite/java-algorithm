package com.likelion.algorithm1205;

import java.util.PriorityQueue;

public class MoreSpicy {


    public int solution(int[] scoville, int K) {

        int answer = 0;

        if(scoville.length == 1){
            if(scoville[0] >= K){
                return answer;
            } else{
                return -1;
            }
        } else if(scoville.length ==0){
            return -1;
        }

        PriorityQueue<Integer> priorityQueue  = new PriorityQueue<>(scoville.length);


        // O(NlogN)

        for (int i = 0; i < scoville.length ; i++) {
            priorityQueue.add(scoville[i]);

        }

        int min1 = priorityQueue.poll();

        if(min1 >= K){
            return answer;
        }

        int min2 = priorityQueue.poll();
        int sum = min1 + 2*min2;
        priorityQueue.add(sum);
        System.out.printf("min1: %d, min2: %d\n", min1, min2);
        System.out.printf("sum: %d\n", sum);
        answer += 1;

        // while의 조건을 sum이 아니라 우선순위 큐의 최솟값으로 두어야 한다!
        while(priorityQueue.peek()< K){

//            System.out.printf("answer: %d\n", answer);

            if (priorityQueue.size() == 1) {
                int num = priorityQueue.poll();
                if(num >= K){
//                    System.out.printf("answer2: %d\n", answer);
                    return answer;
                } else{
//                    System.out.printf("answer3: %d\n", answer);
                    return -1;
                }

            } else if (priorityQueue.size()==0) {

                return -1;
            } else{

                if(priorityQueue.peek() >= K){
                    return answer;
                }

                min1 = priorityQueue.poll();
                min2 = priorityQueue.poll();

                sum = min1 + 2*min2;
                System.out.printf("min1: %d, min2: %d\n", min1, min2);
                System.out.printf("sum: %d\n", sum);
                priorityQueue.add(sum);
                answer += 1;
            }

        }


        return answer;
    }



    public static void main(String[] args) {

        MoreSpicy moreSpicy = new MoreSpicy();
        System.out.println(moreSpicy.solution(new int[]{1, 2, 3, 9, 10, 12}, 7)); // 5 -> 11 (2)
        System.out.println(moreSpicy.solution(new int[]{7, 7, 7, 7, 7, 7, 7}, 7)); // (0)
        System.out.println(moreSpicy.solution(new int[]{1, 2, 2, 4}, 28)); // 5-> 9-> 17 (-1)
        System.out.println(moreSpicy.solution(new int[]{1, 2, 1, 7, 5, 6, 1, 2}, 11)); // 3-> 5-> 9-> 13 (4)
        System.out.println(moreSpicy.solution(new int[]{7}, 7)); // 0
        System.out.println(moreSpicy.solution(new int[]{1}, 7)); // -1
        System.out.println(moreSpicy.solution(new int[]{}, 7)); // -1
        System.out.println(moreSpicy.solution(new int[]{1,1,1,1,1,1,1,1,1}, 7)); //3->5->7: 3번
    }
}

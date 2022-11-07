package com.likelion.algorithm1107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakeArrWithDivisor {

    public List<Integer> solution(int[] arr, int divisor) {

        List<Integer> answer = new ArrayList<>();
//        int[] answer = new int[arr.length];
//        int index=0;


        for (int num:arr) {
            if(num %divisor == 0){
                answer.add(num);

//                answer[index] = num;
//                index++;
            }
        }




        if(answer.size() == 0){
            answer.add(-1);
        }

        Collections.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
       MakeArrWithDivisor makeArrWithDivisor = new MakeArrWithDivisor();
       System.out.println(makeArrWithDivisor.solution(new int[]{5,9,7,10}, 5));
       System.out.println(makeArrWithDivisor.solution(new int[]{2,36,1,3}, 1));
       System.out.println(makeArrWithDivisor.solution(new int[]{3,2,6}, 10));
    }


}

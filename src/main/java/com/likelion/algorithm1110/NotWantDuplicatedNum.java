package com.likelion.algorithm1110;

// arr의 크기가 100만 -> O(2N)이면 안돌아감
// List를 써서 반복문을 한 번만 돌릴 수 있도록 해야함


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotWantDuplicatedNum {
    public List<Integer>  solution(int[] arr) {

        List<Integer> answer = new ArrayList<>();

        String indexs = "0";

        answer.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] == arr[i]){
                continue;
            }else{
                answer.add(arr[i]);
            }
        }

//
//        System.out.println(indexs);

//        int[] answer = new int[indexs.length()];
//        int idx = 0;
//
//        for (int i = 0; i < indexs.length(); i++) {
//            answer[idx++] = arr[Integer.parseInt(String.valueOf(indexs.charAt(i)))];
//
//        }

        return answer;
    }

}

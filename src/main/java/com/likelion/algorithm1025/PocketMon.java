package com.likelion.algorithm1025;

import java.util.HashMap;
import java.util.Map;

public class PocketMon {

    public int solution(int[] nums){
        int answer = 0;
        int selectNum = nums.length/2;

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int num:nums) {
            if(hashMap.get(num) == null){
                hashMap.put(num, 0);
            } else{
                hashMap.put(num, hashMap.get(num)+1);
            }
        }
        int keyNums = hashMap.keySet().size();

        if (keyNums > selectNum){
            answer += selectNum;
        } else{
            answer += keyNums;
        }

        return answer;
    }

    public static void main(String[] args) {
        PocketMon pocketMon = new PocketMon();
        System.out.println(pocketMon.solution(new int[]{3,3,3,2,2,4}));
    }
}

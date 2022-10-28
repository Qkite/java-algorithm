package com.likelion.algorithm1028;

import java.util.HashMap;
import java.util.Map;

public class PonketMon1 {

    public int solution(int[] nums){

        Map<Integer, Integer> hashMap = new HashMap<>();
        // 폰켓몬의 종류를 key, 각 종류에 대한 폰켓몬의 수를 value로 받음

        for (int num:nums) {
            if(hashMap.get(num) == null){
                hashMap.put(num, 0);
            } else{
                hashMap.put(num, hashMap.get(num)+1);
            }
        }
        int keyNums = hashMap.keySet().size();
        // key의 개수

        if (keyNums > nums.length/2){
            return nums.length/2;
        } else{
            return keyNums;
        }

    }
}

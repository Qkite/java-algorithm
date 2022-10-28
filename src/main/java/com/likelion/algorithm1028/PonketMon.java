package com.likelion.algorithm1028;

import java.util.HashSet;
import java.util.Set;

public class PonketMon {

    public int solution(int[] nums){
        Set<Integer> ponketMonSet = new HashSet<Integer>();

        // 중복을 없애기 위해서 set 사용

        for (int num: nums) {
            ponketMonSet.add(num);
        }

        if (nums.length/2 > ponketMonSet.size()){
            return ponketMonSet.size();
        } else{
            return nums.length/2;
        }

    }
}

package com.likelion.algorithm1114;

import java.util.Arrays;

public class LeaveOnlyPrimeNum {

    public int[] leavingPrimeNum(int length){
        int[] result = new int[length-1];
        for (int i = 0; i < length-1; i++) {
            result[i] = i+2;
        }

        for (int i = 1; i < length-1; i++) {
            if(result[i] % 2 == 0){
                result[i] = 0;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        LeaveOnlyPrimeNum leaveOnlyPrimeNum = new LeaveOnlyPrimeNum();

        System.out.println(Arrays.toString(leaveOnlyPrimeNum.leavingPrimeNum(50)));

    }
}



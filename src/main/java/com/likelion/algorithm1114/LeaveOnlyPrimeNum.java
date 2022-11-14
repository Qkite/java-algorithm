package com.likelion.algorithm1114;

import java.util.Arrays;

public class LeaveOnlyPrimeNum {

    public int[] leavingPrimeNum(int length){
        int[] result = new int[length-1];
        for (int i = 0; i < length-1; i++) {
            result[i] = i+2;
        }

        //2의 배수

/*        for (int i = 1; i < length-1; i++) {
            if(result[i] % 2 == 0){
                result[i] = 0;
            }
        }*/

        // 3의 배수

/*        for (int i = 2; i < length-1; i++) {
            if(result[i] % 3 ==0){
                result[i] = 0;
            }
        }*/

        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length-1; j++) {
                if(result[j] % (i+2) == 0){
                    result[j] = 0;
                }

            }
        }

        return result;

    }

    public static void main(String[] args) {
        LeaveOnlyPrimeNum leaveOnlyPrimeNum = new LeaveOnlyPrimeNum();

        System.out.println(Arrays.toString(leaveOnlyPrimeNum.leavingPrimeNum(50)));

    }
}



package com.likelion.algorithm1102;

// 에라토스테네스의 체


import java.util.ArrayList;
import java.util.List;

public class IsITPrimeNumber3 {


    // 2: 2,4,6,... -> 초항: 2*2-2, 공차: 2
    // 3: 4,7,10,... --> 초항: 3*2-2 공차: 3
    // 4: 6,10,14,...
    // 5: 8,13,18,...
    // 6: 10,16,22...
    // 7: 12,19,26,...
    // --> ni-2 i는 2부터 시작




    public static void main(String[] args) {
        int N = 1000000;
        boolean[] checkarray = new boolean[N];

        for (int i = 2; i*i <= N; i++) {
            for (int j = 2*i-2; j <N ; j = j+i) {
                checkarray[j] = true;
            }

        }

        int count = 0;

        for (boolean status:checkarray) {
            if(status == false){
                count++;
            }
        }
        System.out.println(count);

    }
}

package com.likelion.algorithm1102;

// 에라토스테네스의 체


import java.util.ArrayList;
import java.util.List;

public class IsITPrimeNumber3 {

    // % 연산을 하지 않는 것


    // 2: 2,4,6,... -> 초항: 2*2-2, 공차: 2
    // 3: 4,7,10,... --> 초항: 3*2-2 공차: 3
    // 4: 6,10,14,...
    // 5: 8,13,18,...
    // 6: 10,16,22...
    // 7: 12,19,26,...
    // --> ni-2 i는 2부터 시작




    public static void main(String[] args) {
        int N = 5;
        boolean[] checkarray = new boolean[N-1];
        // 주의1) 배열이 2부터 시작함 -> 총 N-1개

        for (int i = 2; i*i <= N; i++) {
            for (int j = 2*i-2; j <N-1 ; j = j+i) {
                checkarray[j] = true;
            }
        }

        // 주의2) index가 2의 index가 0이므로 N-2
        // for문에서는 j<N-1로 정지조건을 설정해야함

        int count = 0;

        for (int i = 0; i < checkarray.length; i++) {
            if(checkarray[i]==false){
                System.out.println(i);
                count++;
            }

        }
        System.out.println(count);

    }
}

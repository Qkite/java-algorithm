package com.likelion.algorithm1102;

// 에라토스테네스의 체


import java.util.ArrayList;
import java.util.List;

public class IsITPrimeNumber3 {
    // 2: 2,4,6,...
    // 3: 4,7,10,...
    // 4: 6,10,14,...
    // 5: 8,13,18,...
    // 6: 10,16,22...
    // 7: 12,19,26,...

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            System.out.printf("%d %d\n", i, (i-1)*2);
        }
    }
}

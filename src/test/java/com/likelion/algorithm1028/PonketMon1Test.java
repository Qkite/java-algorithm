package com.likelion.algorithm1028;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PonketMon1Test {

    @Test
    void test() {
        PonketMon1 ponketMon1 = new PonketMon1();

        int result1 = ponketMon1.solution(new int[]{3, 1, 2, 3});
        int result2 = ponketMon1.solution(new int[]{3, 3, 3, 2, 2, 4});
        int result3 = ponketMon1.solution(new int[]{3, 3, 3, 2, 2, 2});

        assertEquals(2, result1);
        assertEquals(3, result2);
        assertEquals(2, result3);
    }
}
package com.likelion.algorithm1028;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PonketMonTest {

    @Test
    void test(){
        PonketMon ponketMon = new PonketMon();

        int result1 = ponketMon.solution(new int[]{3,1,2,3});
        int result2 = ponketMon.solution(new int[]{3,3,3,2,2,4});
        int result3 = ponketMon.solution(new int[]{3,3,3,2,2,2});

        assertEquals(2, result1);
        assertEquals(3, result2);
        assertEquals(2, result3);





    }

}
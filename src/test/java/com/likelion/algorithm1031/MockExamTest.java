package com.likelion.algorithm1031;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MockExamTest {

    @Test
    void test1(){
        MockExam mockExam = new MockExam();
        int []result = mockExam.solution(new int[] {1,2,3,4,5});

        assertEquals(result.length,1);

    }

}
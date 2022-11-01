package com.likelion.algorithm1101;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsITPrimeNumberTest {

    @Test
    void calWithSolution1(){

        IsITPrimeNumber isITPrimeNumber = new IsITPrimeNumber();
        assertTrue(isITPrimeNumber.solution1(13));
        assertTrue(isITPrimeNumber.solution1(17));
        assertTrue(isITPrimeNumber.solution1(19));
        assertTrue(isITPrimeNumber.solution1(23));
    }

    @Test
    void calWithSolution2(){

        IsITPrimeNumber isITPrimeNumber = new IsITPrimeNumber();
        assertTrue(isITPrimeNumber.solution2(13));
        assertTrue(isITPrimeNumber.solution2(17));
        assertTrue(isITPrimeNumber.solution2(19));
        assertTrue(isITPrimeNumber.solution2(23));
    }

    @Test
    void calWithSolution3(){

        IsITPrimeNumber isITPrimeNumber = new IsITPrimeNumber();
        assertTrue(isITPrimeNumber.solution3(13));
        assertTrue(isITPrimeNumber.solution3(17));
        assertTrue(isITPrimeNumber.solution3(19));
        assertTrue(isITPrimeNumber.solution3(23));
    }


}
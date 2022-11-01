package com.likelion.algorithm1101;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsITPrimeNumberTest {

    @Test
    void cal(){

        IsITPrimeNumber isITPrimeNumber = new IsITPrimeNumber();
        assertTrue(isITPrimeNumber.solution(13));
        assertTrue(isITPrimeNumber.solution(17));
        assertTrue(isITPrimeNumber.solution(19));
        assertTrue(isITPrimeNumber.solution(23));
    }

}
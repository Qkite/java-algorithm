package com.likelion.algorithm1028;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberListTest {

    @Test
    void test(){

        PhoneNumberList phoneNumberList = new PhoneNumberList();
        boolean result1 = phoneNumberList.solution(new String[]{"119", "97674223", "1195524421"});
        boolean result2 = phoneNumberList.solution(new String[]{"123","456","789"});
        boolean result3 = phoneNumberList.solution(new String[]{"12","123","1235","567","88"});

        assertEquals(false, result1);
        assertEquals(true, result2);
        assertEquals(false, result3);




    }

}
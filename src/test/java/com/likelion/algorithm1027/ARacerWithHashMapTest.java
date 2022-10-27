package com.likelion.algorithm1027;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ARacerWithHashMapTest {

    @Test
    void test(){
        ARacerWithHashMap aRacerWithHashMap = new ARacerWithHashMap();
        String personWhoDidNotFinish1 = aRacerWithHashMap.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        String personWhoDidNotFinish2 = aRacerWithHashMap.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        String personWhoDidNotFinish3 = aRacerWithHashMap.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});

        assertEquals(personWhoDidNotFinish1, "leo");
        assertEquals(personWhoDidNotFinish2, "vinko");
        assertEquals(personWhoDidNotFinish3, "mislav");

    }




}
package com.likelion.algorithm1027;

import java.util.HashMap;
import java.util.Map;

public class ARacerWithHashMap {

    public String solution(String[] participant, String[] completion){
        String whoDidNotFinish= null;

        Map<String, Integer> memo = new HashMap<>();


        // String에 동명이인이 있으면 String에 1을 넣고 출력할 때는 빼기 -> ?

        for (int i=0; i<participant.length; i++){
            String key = participant[i];
            memo.put(key, 1);
        }

        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, 0);
        }
        

        for (String key:memo.keySet()) {
            if (memo.get(key) == 1){
                whoDidNotFinish = key;
            }
            
        }

        return whoDidNotFinish;
    }
}

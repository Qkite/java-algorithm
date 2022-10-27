package com.likelion.algorithm1027;

import com.likelion.algorithm1025.DidNotFinishRace;
import com.likelion.algorithm1026.HashTablePractice;

import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

//public class WhoDidNotFinishTheRace {
//
//
//
//    private int size = 100000;
//    WhoDidNotFinishTheRace(){
//
//    }
//
//    WhoDidNotFinishTheRace(int size){
//        this.size = size;
//    }
//
//
//    class FinishTheRace{
//        private String key;
//        private int value = 0;
//
//        FinishTheRace(String key, int value){
//            this.value = value;
//            this.key = key;
//        }
//
//        public int getValue() {
//            return value;
//        }
//    }
//
//    List<FinishTheRace>[] table = new ArrayList[size];
//
//    private int hash(String key) {
//        int asciiSum=0;
//        for (int i = 0; i < key.length(); i++) {
//            asciiSum += key.charAt(i);
//        }
//
//        return asciiSum % size;
//    }
//
//
//    public void insert(String key, int value){
//
//        table[hash(key)].add(new FinishTheRace(key, value));
//
//    }
//
//    public Integer search(String key) {
//        List<FinishTheRace> nodes = this.table[hash(key)];
//        for (FinishTheRace node : nodes) {
//            return node.getValue();
//        }
//
//    }



//    public String solution(String[] participant, String[] completion){
//        // 동명이인이 있을 수 있다 -> hash를 반드시 사용해야함
//
//        WhoDidNotFinishTheRace whoDidNotFinishTheRace = new WhoDidNotFinishTheRace(participant.length);
//
//        for (String par:participant) {
//            whoDidNotFinishTheRace.insert(par, 1);
//        }
//        for (String com:completion) {
//            (whoDidNotFinishTheRace.search(com)+1)
//
//        }
//
//    }
//}

// 해쉬 테이블 바로 이용하기
//    public String solution(String[] paricipant, String[] completion) {
//        Hashtable<String, Integer> hashtable = new Hashtable<>();
//        String[] revisedParticipants= new String[paricipant.length];
//        String answer = "";
//
//        int idx = 0;
//
//        for (String par : paricipant) {
//            while(hashtable.get(par) != null){
//                par += "1";
//            }
//
//            hashtable.put(par, 0);
//            revisedParticipants[idx] = par;
//            idx++;
//
//
//        }
//
//        for (String comp : completion) {
//            while(hashtable.get(comp) == 1){
//                comp += "1";
//            }
//
//            hashtable.put(comp, 1);
//            // put을 이용해서 경기를 완주한 경우 1로 value를 바꾸어줌
//        }
//
//        for (String par : revisedParticipants) {
//            if (hashtable.get(par) == 0) {
//                answer += par;
//            }
//
//        }
//
//
//        return answer.replace("1", "");
//    }
//
//    public static void main(String[] args) {
//        DidNotFinishRace didNotFinishRace = new DidNotFinishRace();
//        String answer = didNotFinishRace.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"marina", "josipa", "nikola", "vinko"});
//        System.out.println(answer);
//
//    }

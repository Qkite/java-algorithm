package com.likelion.algorithm1027;

import com.likelion.algorithm1026.HashTablePractice;

import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class WhoDidNotFinishTheRace {
    private int size = 100000;
    WhoDidNotFinishTheRace(){

    }

    WhoDidNotFinishTheRace(int size){
        this.size = size;
    }


    class FinishTheRace{
        String key;
        int value = 0;

        FinishTheRace(String key, int value){
            this.value = value;
            this.key = key;
        }

    }

    List<FinishTheRace>[] table = new ArrayList[size];

    private int hash(String key) {
        int asciiSum=0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }

        return asciiSum % size;
    }


    public void insert(String key, int value){

        table[hash(key)].add(new FinishTheRace(key, value));

    }



    public String solution(String[] participant, String[] completion){
        // 동명이인이 있을 수 있다 -> hash를 반드시 사용해야함


        for (String person:participant) {
            insert(person, 0);
        }

        for (String com:completion) {
            insert(com,1);
        }






        return null;
    }
}

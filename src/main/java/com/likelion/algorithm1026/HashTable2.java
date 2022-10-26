package com.likelion.algorithm1026;

import java.util.ArrayList;
import java.util.List;

public class HashTable2 {

    // 내부 클래스
    class Node{
        private String key;
        private Integer value;

        public Node(String key, Integer value){
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }
    int size=1000;

    List<Node>[] table = new ArrayList[size];
    // LinkedList로 구현하는 경우도 있음


    public int hash(String key){
        int asciiSum=0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }

        return asciiSum % size;
    }

    // key와 value를 받는 insert 함수를 통해 array에 저장
    public void insert(String key, int value){
        int hashIdx = hash(key);
        if (this.table[hashIdx] == null){
            this.table[hashIdx] = new ArrayList<>();
        }

        // key와 value를 같이 넣는 방법: Map 또는 Object를 사용
        this.table[hashIdx].add(new Node(key, value));

    }

    public Integer get(String key){
        List<Node> nodes = this.table[hash(key)];
        for (Node node: nodes){
            if(key.equals((node.getKey()))){
                return node.value;
            }
        }
        return null;
    }


    public static void main(String[] args) {

        HashTable2 hashTable2 = new HashTable2();
        hashTable2.insert("Yoonseo", 1);
        hashTable2.insert("Seoyoon", 2);

        // 해쉬 충돌 문제 해결
        
        if(hashTable2.get("Yoonseo") == 1){
            System.out.println("테스트 성공");
        } else{
            System.out.println("테스트 실패");
        }

        if(hashTable2.get("Seoyoon")== 2){
            System.out.println("테스트 성공");
        } else{
            System.out.println("테스트 실패");
        }


    }



}

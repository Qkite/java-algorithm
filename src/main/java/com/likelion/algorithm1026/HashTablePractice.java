package com.likelion.algorithm1026;

import java.util.ArrayList;
import java.util.List;

public class HashTablePractice {

    //table의 사이즈 설정

    int size = 10000;

    // key와 value를 둘다 넣는 방법 --> 내부 클래스를 구현
    class Node {
        private String key;
        private int value;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }

        return asciiSum % size;
    }


    List<Node>[] hashTable = new ArrayList[size];

    public void insert(String key, int value) {
        int hashIdx = hash(key);
        hashTable[hashIdx].add(new Node(key, value));
    }

    public Integer search(String key) {
        List<Node> nodes = this.hashTable[hash(key)]; // 충돌로 여러개일 수 있으므로 List의 형태로 받음
        for (Node node : nodes) {
            return node.getValue();
        }
        return null; // return Integer를 닫기 위함
    }

    public static void main(String[] args) {

        HashTable2 hashTable2 = new HashTable2();
        hashTable2.insert("Yoonseo", 1);
        hashTable2.insert("Seoyoon", 2);

        // 해쉬 충돌 문제 해결

        if (hashTable2.get("Yoonseo") == 1) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }

        if (hashTable2.get("Seoyoon") == 2) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }


    }
}

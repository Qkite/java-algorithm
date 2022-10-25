package com.likelion.algorithm1925;

public class HashFunction {
    // 핵심 로직 1
    // 입력받은 key를 한 글자씩 ascii code로 바꿔서 합친다
    // Kyeongrok이면 75+121+101+111+110+103+114+111+107 = 953
    // 그 후 key의 개수를 나눠서 나머지를 구함
    public int hash(String key){
        int asciiSum=0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        System.out.println(asciiSum);

        return asciiSum % 90;
    }

    public static void main(String[] args) {
        HashFunction hashFunction = new HashFunction();
        hashFunction.hash("Kyeongrok");

    }
}

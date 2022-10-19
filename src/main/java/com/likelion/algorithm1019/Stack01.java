package com.likelion.algorithm1019;

public class Stack01 {
    private int[] arr = new int[10000];
    private int pointer = -1; // -1이면 비어있는 상태

    public Stack01(){
        // 기본은 10000개의 array로 설정하게 빈 constructor를 설정함
    }

    public Stack01(int size){
        this.arr = new int[size];
    }

    public int[] push(int value){
        pointer++;
        // pointer의 초기값이 -1이기 때문에 pointer를 먼저 증가시켜주고 시작함
        arr[pointer] = value;
        return arr;
    }

    public int pop(){
        // return한 다음 값을 제거할 수 없기 때문에 return할 값을 미리 담아두어야 함
        int value = arr[pointer];
        pointer--;
        // pointer를 이동시킴, 남아있는 정보는 나중에 push할 때 제거되므로 신경쓰지 않아도 됨
        return value;
    }

    public int[] getArr(){
        return arr;
    }


}

package com.likelion.algorithm1205;

import java.util.Arrays;

public class Heap {

    int[] makeHeap1(int[] array, int input){

        int[] result = new int[array.length+1];
        int idx = array.length;

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }

        result[array.length] = input;


        while ((input > array[idx/2]) & (idx > 0)){
            result[idx] = array[idx/2];
            idx /= 2;

            if(idx == 0){
                result[idx] = input;

            }
        }

        return result;
    }

    void convertToHeap(int parentIdx){

        // 부모 idx 입력하면 자식 idx 출력

        int childIdx1 = parentIdx*2 +1;
        int childIdx2 = parentIdx*2 +2;

        System.out.printf("%d 의 자식 노드는 %d 와 %d 입니다.\n", parentIdx, childIdx1, childIdx2);
    }


    int[] makeHeap2(int[] arr, int parentIdx){


        int childIdx1 = parentIdx*2 +1;
        int childIdx2 = parentIdx*2 +2;
        int greaterIdx = parentIdx;

        if(arr.length>childIdx1){
            if (arr[childIdx1] > arr[greaterIdx]){
                greaterIdx = childIdx1;
            }

        }

        if(arr.length>childIdx2){
            if (arr[childIdx2] > arr[greaterIdx]){
                greaterIdx = childIdx2;
            }

        }


        //  자식 index로 바뀜 -> heap하지 않음 ->
        //  자식 노드와 부모 노드의 값을 바꿈
        if(greaterIdx == childIdx1){
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[childIdx1];
            arr[childIdx1] = temp;

        } else if (greaterIdx == childIdx2) {
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[childIdx2];
            arr[childIdx2] = temp;
        }

        if(parentIdx > 0){
            if (arr[parentIdx] > arr[(parentIdx-1)/2]){
                arr = makeHeap2(arr, (parentIdx-1)/2);
            }

        }

        return arr;
    }

    int[] sort(int[] arr){

        // 부모 노드의 끝: 0*2, 1*2, 3*2, 7*2, 15*2,...
        // (2^(depth-1) -1)*2

        int depth = (int) (Math.floor(Math.log((arr.length-1)/2)/Math.log(2))+1);
        // 트리의 깊이

        System.out.println("depth: " + depth);
        for (int i = (int) (Math.pow(2, depth-1)*2 - 2); i>=0; i--) {
            System.out.println("parentIdx" + i);
            arr = makeHeap2(arr, i);
        }

        return arr;
    }

    public static void main(String[] args) {

        Heap heap = new Heap();
        System.out.println(Arrays.toString(heap.makeHeap1(new int[]{6, 5, 7}, 8)));
        heap.convertToHeap(10);
        heap.convertToHeap(33);
        System.out.println(Arrays.toString(heap.makeHeap2(new int[]{6, 5, 7, 8}, 1)));
        System.out.println(Arrays.toString(heap.sort(new int[]{4,8,5,7,3,2,9,6,7})));



    }
}

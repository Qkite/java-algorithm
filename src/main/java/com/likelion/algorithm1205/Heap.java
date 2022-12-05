package com.likelion.algorithm1205;

import java.util.Arrays;

public class Heap {

    int[] makeHeap(int[] array, int input){

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

    int[] makeHeap2(int[] array){

        // 부모 노드의 끝: 0*2, 1*2, 3*2, 7*2, 15*2,...
        // (2^depth -1)*2

        int depth = (int) (Math.log(array.length-1)/Math.log(2) + 1);


        for (int i = 0; i <= (2*depth-1)*2 ; i++) {
            int parentIdx = i;
            int childIdx1 = parentIdx*2 +1;
            int childIdx2 = parentIdx*2 +2;

            if(parentIdx)


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

    public static void main(String[] args) {

        Heap heap = new Heap();
        System.out.println(Arrays.toString(heap.makeHeap(new int[]{6, 5, 7}, 8)));
        heap.convertToHeap(10);
        heap.convertToHeap(33);



    }
}

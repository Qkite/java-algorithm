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

    public static void main(String[] args) {

        Heap heap = new Heap();
        System.out.println(Arrays.toString(heap.makeHeap(new int[]{6, 5, 7}, 8)));

    }
}

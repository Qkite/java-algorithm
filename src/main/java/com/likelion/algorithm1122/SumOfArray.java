package com.likelion.algorithm1122;

public class SumOfArray {

    public int summation (int[] arr, int idx){

        if (idx < 0){
            return 0;
        } else{
            return arr[idx] + summation(arr, --idx) ;
        }
    }

    public static void main(String[] args) {
        SumOfArray sumOfArray = new SumOfArray();
        int[] arr = new int[] {7,3,2,9};
        System.out.println(sumOfArray.summation(arr, arr.length-1));
        // stack over flow 에러..?
    }
}

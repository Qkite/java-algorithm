package com.likelion.algorithm1122;

public class SumOfArray {

    public int summation (int[] arr, int idx){
        int sum = 0;

        if(idx >= arr.length){
            return sum;
        }
        
        sum += arr[idx];
//            System.out.println(idx);
        summation(arr, ++idx);
        // idx ++ 로 하면 대입 후 증가함 -> 0에서 업데이트가 되지 않음
        // ++idx를 이용해야 함

        return sum;
    }

    public static void main(String[] args) {
        SumOfArray sumOfArray = new SumOfArray();
        System.out.println(sumOfArray.summation(new int[] {7,3,2,9}, 0));
        // stack over flow 에러..?
    }
}

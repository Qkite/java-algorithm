package com.likelion.algorithm1108;

import java.util.Scanner;

public class BinarySearchCodeUp {

    public boolean getSolution(int[] nums, int num){
        int firstIdx = 0;
        int lastIdx = nums.length-1;
        int midIdx = (firstIdx + lastIdx)/2;

        while(lastIdx - firstIdx>1){
            // lastIdx > firstIdx로 하면 index 차이가 1개인 경우 index가 업데이트가 되지 않음 -> 무한 루프
            // 따라서 차이가 2 이상 나는 경우에만 index를 업데이트 하도록 함
            if(num < nums[midIdx]){
                lastIdx = midIdx;
            } else{
                firstIdx = midIdx;
            }

            midIdx = (firstIdx + lastIdx)/2;

        }

        return num == nums[midIdx];

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split(" ");
        String[] inputArray = scanner.nextLine().split(" ");
        int[] numsArray = new int[inputArray.length];
        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = Integer.parseInt(inputArray[i]);
        }

        BinarySearchCodeUp binarySearchCodeUp = new BinarySearchCodeUp();
        System.out.println(binarySearchCodeUp.getSolution(numsArray, Integer.parseInt(info[1])));


    }

}

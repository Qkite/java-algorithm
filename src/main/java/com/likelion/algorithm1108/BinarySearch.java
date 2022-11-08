package com.likelion.algorithm1108;

import java.util.Scanner;

public class BinarySearch {

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

        if(num == nums[midIdx]){
            return true;
        } if(num == nums[lastIdx]){
            return true;
        } else{
            return false;
        }

    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.getSolution(new int[]{1,2,3,4,5,6,7,8,9,10,1021,1221,1321,1562,15678}, 3));
        System.out.println(binarySearch.getSolution(new int[]{1,3,4,5,6,7,9,10,1111,13111,15111,1611111}, 15111));
        System.out.println(binarySearch.getSolution(new int[]{1,3,4,5,6,7,9,10,11,13,15,16,22,21,25,28}, 23));



    }

}

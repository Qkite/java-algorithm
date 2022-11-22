package com.likelion.algorithm1117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CodeUp3014 {

    private void change(int[] arr, int startIdx, int endIdx) {

        // 메모리 초과 -> return을 void로 바꾸어도 동일


        int leftIdx = startIdx;
        int rightIdx = endIdx;
        int pivotIdx = (leftIdx + rightIdx + 1) / 2;

        while (leftIdx <= rightIdx) {

            if (arr[leftIdx] < arr[pivotIdx]) {
                leftIdx++;
            } else if (arr[pivotIdx] < arr[rightIdx]) {
                rightIdx--;

            } else {
                int temp = arr[rightIdx];
                arr[rightIdx] = arr[leftIdx];
                arr[leftIdx] = temp;

                leftIdx++;
                rightIdx--;
            }

        }


        if (startIdx < rightIdx) change(arr, startIdx, rightIdx);
        if (leftIdx < endIdx) change(arr, leftIdx, endIdx);


    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        CodeUp3014 codeUp3014 = new CodeUp3014();
        codeUp3014.change(nums, 0, nums.length - 1);

        for (int a : nums) {
            System.out.print(a + " ");

        }


    }
}

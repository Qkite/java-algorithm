package com.likelion.altorithm1124;

import java.util.Arrays;
import java.util.Scanner;

// 계산한 적 있는 값은 적어두고 다시 보지 않음
public class CodeUp1862 {

    public void fibonacci(long[] arr, int nth){

        if (nth == 1){
            arr[nth-1]=1;
        } else if (nth==2){
            if(arr[nth-1] == 0){
                fibonacci(arr, nth-1);
                arr[nth-1] = 1;

            }

        } else{
            if(arr[nth-1] == 0){
                fibonacci(arr, nth-1);
                arr[nth-1] = (arr[nth-2] + arr[nth-3]) % 1000000007;
            }
        }

    }

    public long[] saveNums(int num){
        long[] arr = new long[num];
        fibonacci(arr, num);

        return arr;

    }


    public static void main(String[] args) {
        CodeUp1862 codeUp1862 = new CodeUp1862();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long[] fibArray = codeUp1862.saveNums(num);
        System.out.println(fibArray[num-1]);
    }

}

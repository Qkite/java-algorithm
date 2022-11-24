package com.likelion.altorithm1124;

import java.util.Arrays;
import java.util.Scanner;

// 코드업 1862 문제와 동일한 풀이
public class CodeUp1916 {

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
                arr[nth-1] = (arr[nth-2] + arr[nth-3]) % 10009;
            }
        }

    }

    public long[] saveNums(int num){
        long[] arr = new long[num];
        fibonacci(arr, num);

        return arr;

    }


    public static void main(String[] args) {
        CodeUp1916 codeUp1916 = new CodeUp1916();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long[] fibArray = codeUp1916.saveNums(num);
        System.out.println(fibArray[num-1]);
    }

}

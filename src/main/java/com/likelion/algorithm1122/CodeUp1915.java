package com.likelion.algorithm1122;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1915 {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        CodeUp1915 codeUp1915 = new CodeUp1915();
        int nth = Integer.parseInt(bufferedReader.readLine());
        System.out.println(codeUp1915.fibonacci(nth));
    }

    private int fibonacci(int nth) {

        if(nth == 1){
            return 1;
        } if(nth==2){
            return 1;
        }


        return fibonacci(nth-1) + fibonacci(nth-2);
    }
}

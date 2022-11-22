package com.likelion.algorithm1122;

import java.util.Scanner;

public class SumOfDigits {

    int sum(String input, int idx){

        if(idx<0){
            return 0;
        }

        return Integer.valueOf(input.substring(idx, idx+1)) + sum(input, --idx);
    }


    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        Scanner scanner = new Scanner(System.in);
        String input= scanner.next();
        System.out.println(sumOfDigits.sum(input, input.length()-1));
    }
}

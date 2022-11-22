package com.likelion.algorithm1122;

import java.util.Scanner;

public class SumOf1ToN {

    int sum(int num){

        if(num==1){
            return 1;
        }

        return num + sum(--num);
    }

    public static void main(String[] args) {
        SumOf1ToN sumOf1ToN = new SumOf1ToN();
        Scanner scanner = new Scanner(System.in);
        int endNum = scanner.nextInt();
        System.out.println(sumOf1ToN.sum(endNum));

    }
}

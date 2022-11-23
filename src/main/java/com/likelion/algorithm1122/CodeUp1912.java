package com.likelion.algorithm1122;

import java.util.Scanner;

public class CodeUp1912 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        CodeUp1912 codeUp1912 = new CodeUp1912();
        long result = codeUp1912.factorial(num);
        System.out.println(result);
    }

    private long factorial(int num) {

        if(num==1){
            return 1;
        } else{
            return num*factorial(--num);
        }

    }
}

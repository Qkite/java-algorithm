package com.likelion.algorithm1123;

import java.util.Scanner;

public class CodeUp1852 {

    public void print(int num){
        if (num == 1){
            System.out.printf("%d ", num);
        } else{
            print(num-1);
            System.out.printf("%d ", num);
        }


    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        CodeUp1852 codeUp1852 = new CodeUp1852();
        codeUp1852.print(num);

    }
}

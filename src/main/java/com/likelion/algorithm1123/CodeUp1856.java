package com.likelion.algorithm1123;

import java.util.Scanner;

public class CodeUp1856 {

    public int nthStair(int num){

        if(num==1){
            return 1;
        } else if (num==2) {
            return 2;
        } else if (num==3) {
            return 4;

        } else{
            return nthStair(num-1) + nthStair(num-2) + nthStair(num-3);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        CodeUp1856 codeUp1856 = new CodeUp1856();
        System.out.println(codeUp1856.nthStair(num));

    }
}

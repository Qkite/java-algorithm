package com.likelion.algorithm1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1860 {

    public void printNums(int n) {
        if (n == 1) {
            System.out.printf("%d ", n);
        } else {
            printNums(n - 1);
            System.out.printf("%d ", n);
        }

    }

    public void printRows(int num) {
        if (num == 1) {
            printNums(num);
            System.out.println();
        } else {
            printRows(num - 1);
            printNums(num);
            System.out.println();
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        CodeUp1860 codeUp1860 = new CodeUp1860();
        codeUp1860.printRows(num);


    }
}

package com.likelion.altorithm1124;

import java.util.Scanner;

// codeup 1859번 별찍기
public class PrintStarTriangle {

    void printStars(int num){

        if (num==1){
            System.out.printf("%s", "*");
        } else{
            printStars(num-1);
            System.out.printf("%s", "*");
        }
    }

    void printRows(int nth){

        if (nth == 1) {
            printStars(nth);
        } else{
            printRows(nth-1);
            System.out.println();
            printStars(nth);
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nth = scanner.nextInt();
        PrintStarTriangle printStarTriangle = new PrintStarTriangle();
        printStarTriangle.printRows(nth);
    }
}

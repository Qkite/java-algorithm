package com.likelion.algorithm1122;

import java.util.Scanner;

public class PrintStars {
    void print(int num){

        if(num>0){
            System.out.print("*");
            print(--num);
        }



    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        PrintStars printStars = new PrintStars();
        printStars.print(num);

    }
}

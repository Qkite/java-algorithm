package com.likelion.algorithm1122;

import java.util.Scanner;

public class Print1To100 {
    public void printNum(int num){
        System.out.println(num);
        printNum(num);

    }

    public void printNum1(int num){
        if (num == 1){
            System.out.println(num);
        } else{
            System.out.println(num);
            printNum1(num-1);
        }

    }

    public void printNumIncreasing(int startNum, int endNum){
        if (startNum == endNum){
            System.out.println(startNum);
        } else{
            System.out.println(startNum);
            printNumIncreasing(startNum+1, endNum);
        }

    }

    public static void main(String[] args) {
        Print1To100 print1To100 = new Print1To100();
        print1To100.printNum1(100);
        //print1To100.printNum(1); //stackoverflow
        print1To100.printNumIncreasing(1,100);

    }
}

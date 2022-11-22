package com.likelion.algorithm1122;

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

    public static void main(String[] args) {
        Print1To100 print1To100 = new Print1To100();
        print1To100.printNum1(100);
        print1To100.printNum(1); //stackoverflow

    }
}

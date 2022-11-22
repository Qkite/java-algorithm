package com.likelion.algorithm1122;

public class Print1To100 {

    public void printNum(int num){
        if (num == 1){
            System.out.println(num);
        } else{
            System.out.println(num);
            printNum(num-1);
        }

    }

    public static void main(String[] args) {
        Print1To100 print1To100 = new Print1To100();
        print1To100.printNum(100);

    }
}

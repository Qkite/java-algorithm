package com.likelion.altorithm1124;

import java.util.Scanner;

public class CodeUp1861 {

    public int pascalNum(int row, int col) {
        if (row == 1|row == 2) {
            return 1;
        } else if (col == 1|col == row) {
            return 1;
        } else {
            return pascalNum(row-1, col-1) + pascalNum(row-1, col);

        }

    }

    public void printCol(int row, int col) {
        if(row==1 & col==1){
            System.out.println(pascalNum(row, col) + " ");

        } else if(col == 1){
            System.out.printf("%d ", pascalNum(row, col));
        } else if (col == row) {
            printCol(row, col-1);
            System.out.println(pascalNum(row, col) + " ");
        } else{
            printCol(row, col-1);
            System.out.printf("%d ", pascalNum(row, col));
        }

    }

    public void printRows(int num){

        if(num==1){
            printCol(num, num);
        } else{
            printRows(num-1);
            printCol(num, num);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CodeUp1861 codeUp1861 = new CodeUp1861();
        
        int num = scanner.nextInt();
        codeUp1861.printRows(num);


    }
}

package com.likelion.altorithm1124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1904Re {

    void printOdds(int left, int right){

        // 두 수를 홀수로 변환
        if (left % 2 == 0) left++;
        if (right % 2==0) right--;

        if (left == right){
            System.out.printf("%d ", right);
        } else{
            printOdds(left, right-2);
            System.out.printf("%d ", right);

        }



    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = bufferedReader.readLine().split(" ");
        int leftBoundary = Integer.parseInt(inputs[0]);
        int rightBoundary = Integer.parseInt(inputs[1]);

        CodeUp1904Re codeUp1904Re = new CodeUp1904Re();
        codeUp1904Re.printOdds(leftBoundary, rightBoundary);
    }
}

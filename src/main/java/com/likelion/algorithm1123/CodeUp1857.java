package com.likelion.algorithm1123;

import com.likelion.algorithm1122.CodeUp1916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1857 {

    // nCr = n-1Cr-1 + n-1Cr
    // nC0 = 1
    // nC1 = n


    public int choose(int n, int r){

        if(r==0){
            return 1;
        } else if (r==1) {
            return n;
        } else if (n==0) {
            return 0;
        } else{
            return choose(n-1, r-1) + choose(n-1, r);
        }



    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        CodeUp1857 codeUp1857 = new CodeUp1857();
        String[] inputs = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int r = Integer.parseInt(inputs[1]);
        System.out.println(codeUp1857.choose(n,r));

    }
}

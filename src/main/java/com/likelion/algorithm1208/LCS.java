package com.likelion.algorithm1208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LCS {

    int calculateLength(String str1, String str2){
        
        // str1.length(), str2.length() 만큼으로 잡으면
        // 첫번째 행을 따로 처리해주어야 함
        // 값이 0인 행과 열을 추가로 삽입하여
        // 일괄적으로 진행

        int[][] arr = new int[str2.length()+1][str1.length()+1];

        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {

                if(str1.charAt(j-1) == str2.charAt(i-1)){
                    arr[i][j] = arr[i-1][j-1] + 1;

                } else{
                    arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);

                }

            }
        }

        System.out.println(Arrays.deepToString(arr));
        
        return arr[str2.length()][str1.length()];


    }

    public static void main(String[] args) throws IOException {

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String seq1 = bufferedReader.readLine();
//        String seq2 = bufferedReader.readLine();
        String seq1 = "sixhckblwlhaoisdhbiojawkldafjlkasbagiu";
        String seq2 = "kvinxnmcnklbhoqwidjfiojiohas";


        LCS lcs = new LCS();
        System.out.println(lcs.calculateLength(seq1, seq2));

    }
}

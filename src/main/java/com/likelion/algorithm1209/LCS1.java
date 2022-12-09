package com.likelion.algorithm1209;

public class LCS1 {

    int LCS(String str1, String str2){

        int[][] arr = new int[str2.length()+1][str1.length()+1];

        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {

                if(str1.charAt(j-1) == str2.charAt(i-1)){
                    arr[i][j] = arr[i-1][j-1] + 1;
                } else{
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }


            }
        }

        return arr[str2.length()][str1.length()];
    }


    public static void main(String[] args) {

        String seq1 = "ABCDCBA";
        String seq2 = "DCABDC";

        LCS1 lcs1 = new LCS1();
        System.out.println(lcs1.LCS(seq1, seq2));
    }
}

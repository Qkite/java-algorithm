package com.likelion.algorithm1209;

public class LCS1 {

    int LCS(String str1, String str2){
        int answer = 0;

        int[][] arr = new int[str2.length()][str1.length()];

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                System.out.printf("str1: %s,  str2: %s\n", str1.charAt(j), str2.charAt(i));


            }
        }

        return answer;
    }


    public static void main(String[] args) {

        String seq1 = "ABCDCBA";
        String seq2 = "DCABDC";

        LCS1 lcs1 = new LCS1();
        lcs1.LCS(seq1, seq2);
    }
}

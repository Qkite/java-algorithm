package com.likelion.algorithm1128;

public class PressAlphabet {

    void oneLetter(){

        // 65~90
        for (int ascii = 65; ascii < 91; ascii++) {
            System.out.println((char) ascii);
        }
    }

//    void twoLetter(){
//
//
//    }


    public static void main(String[] args) {
        PressAlphabet pressAlphabet = new PressAlphabet();
        pressAlphabet.oneLetter();


    }
}

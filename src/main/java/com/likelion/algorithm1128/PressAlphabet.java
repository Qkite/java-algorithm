package com.likelion.algorithm1128;

public class PressAlphabet {

    void oneLetter(){

        // 65~90
        for (int ascii = 65; ascii < 91; ascii++) {
            System.out.println((char) ascii);
        }
    }

    void twoLetter(){

        for (int ascii1 = 65; ascii1 < 91; ascii1++) {

            for (int ascii2 = 65; ascii2 < 91; ascii2++) {
                System.out.printf("%c %c \n",(char) ascii1, (char) ascii2);
            }


        }

    }


    public static void main(String[] args) {
        PressAlphabet pressAlphabet = new PressAlphabet();
        pressAlphabet.oneLetter();

        pressAlphabet.twoLetter();


    }
}

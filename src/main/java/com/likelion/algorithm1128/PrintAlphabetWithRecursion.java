package com.likelion.algorithm1128;

public class PrintAlphabetWithRecursion {

    void printOneAlphabet(char letter){


        // A부터 Z까지
        if (letter == 'A'){
            System.out.println(letter);
        } else if (letter > 'A') {
            printOneAlphabet((char)(letter-1));
            System.out.println(letter);

        }

    }

    void printTwoAlphabet(char letter1, char letter2){

        if (letter1 == 'A' & letter2 == 'A'){
            System.out.printf("%C %C\n", letter1, letter2);
        } else if (letter1 == 'A' & letter2 > 'A') {

            printTwoAlphabet(letter1, (char) (letter2-1));

            System.out.printf("%C %C\n", letter1, letter2);

        } else if (letter1 > 'A' & letter2 > 'A') {
            printTwoAlphabet((char)(letter1-1), letter2);
            System.out.printf("%C %C\n", letter1, letter2);

        }


    }




    public static void main(String[] args) {

        PrintAlphabetWithRecursion printAlphabetWithRecursion = new PrintAlphabetWithRecursion();
        printAlphabetWithRecursion.printOneAlphabet('Z');
        printAlphabetWithRecursion.printTwoAlphabet('Z', 'Z');

    }
}

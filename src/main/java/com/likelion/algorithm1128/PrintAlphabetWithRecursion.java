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
    
    // 칸의 개수가 소스코드 안에 들어있음 -> 해결
    // letter의 길이를 제시해줌
    // prefix가 변화할 수 있게 해야함

    void printThreeAlphabet(char letter1, String  prefix){

        if (letter1 == 'A'){
            System.out.printf("%s%c\n", prefix,letter1);
        } else if (letter1 > 'A') {

            printThreeAlphabet((char)(letter1-1), prefix);
            System.out.printf("%s%c\n", prefix,letter1);

        }

    }

    public static void printAlphabet(String prefix, int length) {
        if (prefix.length() == length) {
            System.out.println(prefix);
            return;
        }
        

        for (char c = 'A'; c <= 'Z' ; c++) {
            printAlphabet(prefix + c, length);
        }
    }






    public static void main(String[] args) {

        PrintAlphabetWithRecursion printAlphabetWithRecursion = new PrintAlphabetWithRecursion();
//        printAlphabetWithRecursion.printOneAlphabet('Z');
//        printAlphabetWithRecursion.printTwoAlphabet('Z', 'Z');
//        printAlphabetWithRecursion.printThreeAlphabet('Z', "AA");
        printAlphabet("", 3);

    }
}

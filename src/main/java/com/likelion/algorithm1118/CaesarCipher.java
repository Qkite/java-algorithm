package com.likelion.algorithm1118;

public class CaesarCipher {

    String change(String input, int add){

        String output = "";

        for (int i = 0; i < input.length(); i++) {
            // 65~90: 대문자 -> 26개
            // 97~122: 소문자
            // 32: 공백
            char letter= input.charAt(i);
            if((int) letter == 32){
                output += Character.toString(letter);
            } else if ((65<= (int) letter)& (90>= (int) letter)) {
                output += Character.toString((letter-65+add) % 26 + 65);

            } else if ((97<= (int) letter)& (122>= (int) letter)) {
                output += Character.toString((letter-97+add) % 26 + 97);

            } else{
                output += Character.toString(letter+add);
            }

        }

        return output;
    }

    public static void main(String[] args) {

        CaesarCipher caesarCipher = new CaesarCipher();
        System.out.println(caesarCipher.change("AB", 1));
        System.out.println(caesarCipher.change("a B z", 4));


    }
}

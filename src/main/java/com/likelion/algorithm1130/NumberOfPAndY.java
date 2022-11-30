package com.likelion.algorithm1130;

public class NumberOfPAndY {

    boolean solution(String s) {
        boolean answer = true;
        int pNum = 0;
        int yNum = 0;

        for (int i = 0; i < s.length(); i++) {
            String string = s.substring(i, i+1).toLowerCase();

            if(string.equals("p")){
                pNum++;
            }
            if(string.equals("y")){
                yNum++;
            }

        }

        if(pNum==yNum){
            answer = true;
        } else{
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        NumberOfPAndY numberOfPAndY = new NumberOfPAndY();
        System.out.println(numberOfPAndY.solution(	"Pyy"));
    }



}

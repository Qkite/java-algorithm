package com.likelion.algorithm1019;

public class CorrectBracket {



    public boolean solution(String s){

        // Stack을 쓰지않고 푸는 방법
        while(s.indexOf("()") >= 0){
            s = s.replace("()", "");
        }

        return s.length() == 0;
    }

}

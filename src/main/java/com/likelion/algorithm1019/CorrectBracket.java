package com.likelion.algorithm1019;

import java.util.Stack;

public class CorrectBracket {


//  Stack을 쓰지않고 풀기 1: replace 사용
//    public boolean solution(String s){
//
//        
//        while(s.indexOf("()") >= 0){
//            s = s.replace("()", "");
//        }
//
//        return s.length() == 0;
//    }

    // stack 사용하지 않기 2: split 사용하기
//    public boolean solution(String s){
//
//        while (s.indexOf("()")>=0){
//            String[] splitted = s.split("\\(\\)");
//            s = String.join("", splitted);
//            System.out.println(s);
//        }
//        return s.length() == 0;
//    }

    public boolean solution(String s){

        Stack<String> st = new Stack<>();
        boolean answer;
        
        try {
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) == '('){
                    st.push("(");
                }
                else if(s.charAt(i) == ')'){
                    st.pop();
                }
            }
            answer = st.empty();
            
        } catch (Exception e) {
            answer = false;
        }
        return answer;
    }

}

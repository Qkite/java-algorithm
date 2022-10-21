package com.likelion.algorithm1019;

import java.util.Stack;

public class DifferentBracket {

    public boolean solution(String s){

        Stack<String> st = new Stack<>();
        boolean answer = false;
        
        try {
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) == '('){
                    st.push("(");
                }
                else if(s.charAt(i) == ')'){
                    String bracket= st.pop();
                    if(bracket != "("){
                        answer = false;
                    }
                } else if (s.charAt(i) == '{') {
                    st.push("{");

                } else if (s.charAt(i) == '}') {
                    String bracket= st.pop();
                    if(bracket != "{"){
                        answer = false;
                    }
                } else if (s.charAt(i) == '[') {
                    st.push("[");

                } else if (s.charAt(i) == ']') {
                    String bracket= st.pop();
                    if(bracket != "["){
                        answer = false;
                    }
                }
            answer = st.empty();
            }
        }catch (Exception e) {
            answer = false;
            // stack이 비어있으면 EmptyStackException 
        }
        return answer;
    }

}

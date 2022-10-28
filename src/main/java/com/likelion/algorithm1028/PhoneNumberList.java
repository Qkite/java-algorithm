package com.likelion.algorithm1028;

import java.util.Arrays;
import java.util.HashSet;

public class PhoneNumberList {
    public boolean solution(String[] phoneBook) {
        boolean answer = true;



        // 기존 코드: O(N^2)

        /*

        Arrays.sort(phoneBook);

        for (int i = 0; i < phoneBook.length-1; i++) {
            for (int j = i+1; j < phoneBook.length; j++) {
                if(phoneBook[i].length() > phoneBook[j].length() ){
                    continue;
                } else{
                    if(phoneBook[j].indexOf(phoneBook[i]) != -1){
                        answer = false;
                    }
                }
            }
        }
         */

        // 전화번호의 길이가 20으로 제한됨
        // hash는 O(1)임 -> O(20*N)

        HashSet<String> hashSet = new HashSet<>();
        for (String PhoneNum: phoneBook) hashSet.add(PhoneNum);

        for (String num: phoneBook){
            for (int i = 1; i < num.length(); i++) {
                if (hashSet.contains(num.substring(0, i))){
                    answer = false;
                }
            }
        }


        return answer;
    }




}

package com.likelion.algorithm1111;

import java.util.Arrays;

public class SecretMap {
    // toBinaryString을 통해서 이진수로 변환
    // 두 지도를 겹쳤을 때 둘다 0이어야 0 --> 더해서 0이면 " "
    // 아니면 "#"
    // charAt + for문 2번...? -> 이진수의 길이를 똑같이 맞추어야 하는 문제
    // 그냥 2로 나누기 5번 해서 나머지를 구하자
    // 그리고 문자열의 '앞쪽'에 다 더해주는 방식으로

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            String line = "";
            int num1 = arr1[i];
            int num2 = arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if(num1 % 2 + num2 % 2 == 0){
                    line = " " + line;
                } else{
                    line = "#" + line;
                }

                num1 /=2;
                num2 /=2;

            }

            answer[i] = line;
        }

        return answer;
    }



    public static void main(String[] args) {

        int[] arr1 = new int[]{9,20,28,18,11};
        int[] arr2 = new int[]{30,1,21,17,28};

        SecretMap secretMap = new SecretMap();
        System.out.println(Arrays.toString(secretMap.solution(5, arr1, arr2)));


    }

}

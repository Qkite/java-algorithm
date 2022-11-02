package com.likelion.algorithm1102;

// 에라토스테네스의 체


import java.util.ArrayList;
import java.util.List;

public class IsITPrimeNumber2 {

    // 에라토스테네스의 체 -> List를 이용해보자 -> O(NlogN)이므로 시간 초과함
    public int solution1(int N){
        List<Integer> numList= new ArrayList<>(N-1);
        for (int i = 2; i <= N ; i++) {
            numList.add(i-2, i);
        }

        int element = (int) Math.floor(Math.pow(N,0.5));


        for (int i = 2; i <= element; i++) {
            for (int j = 2; j <= N/i; j++) {
                numList.remove(Integer.valueOf(i*j));
            }
        }
        // O(NlogN)

        return numList.size();
    }

    // remove를 하면 그 원소를 지우고 배열을 다시 생성 --> add와 remove를 사용하지 않는 방향으로 가는 것이 좋다
    // 배수인지를 나타내는 check 배열을 사용하는 것이 좋음

    public int solution2(int N){

        int[] numArray = new int[N-1];
        boolean[] isItCompositionNumber = new boolean[N-1];

        for (int i = 2; i <= N; i++) {
            numArray[i-2] = i;
        }

        int element = (int) Math.floor(Math.pow(N,0.5));


        for (int i = 0; i < element; i++) {
            for (int j = i+1; j < numArray.length; j++) {
                if(numArray[j] %numArray[i] ==0 ){
                    isItCompositionNumber[j] = true;
                }
            }
        }
        int sum = 0;

        for (int i = 0; i < isItCompositionNumber.length; i++) {

            if(isItCompositionNumber[i] == false){
                sum++;
            }

        }

        return sum;
    }


}

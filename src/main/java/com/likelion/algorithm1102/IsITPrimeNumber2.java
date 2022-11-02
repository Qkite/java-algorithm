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

    // 어떻게 하면 이중 for문을 없앨 수 있을까...?

    public int solution2(int N){

        int[] numArray = new int[N-1];

        for (int i = 2; i <= N; i++) {
            numArray[i-2] = i;
        }

        return 0;
    }


}

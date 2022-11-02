package com.likelion.algorithm1102;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf {

    public static void main(String[] args) {
        int N = 50;
        List<Integer> numList= new ArrayList<>(N-1);
        for (int i = 2; i <= N ; i++) {
            numList.add(i-2, i);
        }

        int element = (int) Math.floor(Math.pow(N,0.5));

        for (int i = 2; i <= element; i++) {
            for (int j = 2; j <= N/i; j++) {
                numList.remove(Integer.valueOf(i*j));
            }
            System.out.printf("%d: ", i);
            System.out.println(numList);
        }

        System.out.println(numList);
    }
}

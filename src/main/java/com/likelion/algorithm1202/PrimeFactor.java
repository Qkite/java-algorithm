package com.likelion.algorithm1202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactor {
    long maxPrimeFactor(long num, long primeFactor) {

        long divisor = 0;

        if (num <= primeFactor) {
            return primeFactor;
        } else {
            for (int i = 2; i <= num; i++) {
//                System.out.println("i = " + i);
                if (num % i == 0) {
                    if (primeFactor <= i) primeFactor = i;
                    divisor = i;
                    break;

                }
            }

//            System.out.println("num = " + num);
//            System.out.println("primeFactor = " + primeFactor);

            // for 조건이 제대로 안먹음...
        }

        return maxPrimeFactor(num / divisor, primeFactor);
    }



    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(bufferedReader.readLine());


        PrimeFactor primeFactor = new PrimeFactor();
        System.out.println(primeFactor.maxPrimeFactor(number, 2));
    }
}

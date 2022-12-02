package com.likelion.algorithm1202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PrimeFactorization {

    List<Integer> factorization(int num, List<Integer> numlist){

        for (int i = 2; i <= num ; i++) {
            if(num % i == 0){
                numlist.add(i);
                return factorization(num/i, numlist);
            }

        }

        return numlist;
    }

    

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());

        PrimeFactorization primeFactorization = new PrimeFactorization();
        List<Integer> result = primeFactorization.factorization(number, new ArrayList<>());

        Collections.sort(result);

        for (int i = 0; i < result.size(); i++) {
            System.out.printf("%d ", result.get(i));

        }
        
    }
}

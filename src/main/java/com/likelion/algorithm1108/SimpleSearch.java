package com.likelion.algorithm1108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


public class SimpleSearch {

    public void getSolution(List<String> caseList, String forFind){

        int index = caseList.indexOf(forFind);

        if( index> -1){
            System.out.println(index+1);
        } else{
            System.out.println(index);
        }



    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String caseNum = br.readLine();

        String[] cases = br.readLine().split(" ");
        String whatWeNeedFind = br.readLine();
        List<String> caseList = Arrays.asList(cases);

        SimpleSearch simpleSearch = new SimpleSearch();
        simpleSearch.getSolution(caseList, whatWeNeedFind);

    }
}

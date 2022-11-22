package com.likelion.algorithm1122;

import java.util.ArrayList;
import java.util.List;

public class SumOfList {

    public int summmation(List<Integer> list, int idx){

        if (idx < 0){
            return 0;
        } else{
            // return  summmation(list, --idx) + list.get(idx) ;
            // 를 하면 idx가 이미 업데이트가 된 상태이므로 업데이트가 된 idx가 list.get에 넘어감
            return list.get(idx) + summmation(list, --idx) ;
        }


    }

    public static void main(String[] args) {
        SumOfList sumOfList = new SumOfList();
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(9);

        System.out.println(sumOfList.summmation(list, list.size()-1));



    }
}

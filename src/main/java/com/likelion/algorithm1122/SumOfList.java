package com.likelion.algorithm1122;

import java.util.ArrayList;
import java.util.List;

public class SumOfList {

    public int summation(List<Integer> list, int idx){
        // index 이동하기

        if (idx < 0){
            return 0;
        } else{
            // return  summmation(list, --idx) + list.get(idx) ;
            // 를 하면 idx가 이미 업데이트가 된 상태이므로 업데이트가 된 idx가 list.get에 넘어감
            return list.get(idx) + summation(list, --idx) ;
        }

    }

    public int summationWithRemove(List<Integer> list){
        // remove 사용하기

        if(list.isEmpty()){
            return 0;
        } else{
            return list.remove(list.size()-1) + summationWithRemove(list);

            // remove를 하면 stack의 pop 처럼 제거된 원소가 튀어나오게 됨
        }



    }

    public static void main(String[] args) {
        SumOfList sumOfList = new SumOfList();
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(9);

        System.out.println(sumOfList.summation(list, list.size()-1));
        System.out.println(sumOfList.summationWithRemove(list));



    }
}

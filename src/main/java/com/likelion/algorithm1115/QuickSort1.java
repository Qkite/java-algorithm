package com.likelion.algorithm1115;

import java.util.ArrayList;
import java.util.List;

public class QuickSort1 {

    List<Integer> sorting(List<Integer> input){

        if (input.size() == 1){
            return input;
        } else if (input.size()==0) {
            return input;
        } else{
            int pivot = input.get(input.size()/2);
            List<Integer> lessNum = new ArrayList<>();
            List<Integer> moreNum = new ArrayList<>();
            for (int i = 0; i < input.size(); i++) {
                if(i == input.size()/2){
                    continue;

                    // pivot은 건너뛰기
                } else if(input.get(i) < pivot){
                    lessNum.add(input.get(i));
                } else if (input.get(i)>=pivot) {
                    moreNum.add(input.get(i));
                    // 같은 경우도 오른쪽으로 배치하기
                }
            }

            List<Integer> joined = new ArrayList<>();
            joined.addAll(sorting(lessNum));
            joined.add(pivot);
            joined.addAll(sorting(moreNum));
            return joined;


        }

    }


    public static void main(String[] args) {

        QuickSort1 quickSort1 = new QuickSort1();
        List<Integer> integers = new ArrayList<>();
        for (int i:new int [] {20,18,5,19,5,25,40,50}) {
            integers.add(i);
        }
        System.out.println(quickSort1.sorting(integers));

    }
}

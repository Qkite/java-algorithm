package com.likelion.algorithm1027;


import java.util.Hashtable;

public class WhoDidNotFinishTheRace {

    Hashtable<String, Integer> table = new Hashtable<>();


    public String solution(String[] participant, String[] completion) {
        String whoNotFinished = null;

        for (String par:participant) {
            table.put(par, table.getOrDefault(par, 0)+1);
        }

        for (String com:completion) {
            table.put(com, table.get(com)-1);
        }

        for (String par:participant){
            if(table.get(par)!=0){
                whoNotFinished = par;
            }
        }

        return whoNotFinished;

    }

}

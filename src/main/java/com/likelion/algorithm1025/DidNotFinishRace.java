package com.likelion.algorithm1025;

import java.util.Hashtable;

public class DidNotFinishRace {

    public String solution(String[] paricipant, String[] completion) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        String[] revisedParticipants= new String[paricipant.length];
        String answer = "";

        int idx = 0;

        for (String par : paricipant) {
            while(hashtable.get(par) != null){
                par += "1";
            }

            hashtable.put(par, 0);
            revisedParticipants[idx] = par;
            idx++;


        }

        for (String comp : completion) {
            while(hashtable.get(comp) == 1){
                comp += "1";
            }

            hashtable.put(comp, 1);
            // put을 이용해서 경기를 완주한 경우 1로 value를 바꾸어줌
        }

        for (String par : revisedParticipants) {
            if (hashtable.get(par) == 0) {
                answer += par;
            }

        }


        return answer.replace("1", "");
    }

    public static void main(String[] args) {
        DidNotFinishRace didNotFinishRace = new DidNotFinishRace();
        String answer = didNotFinishRace.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"marina", "josipa", "nikola", "vinko"});
        System.out.println(answer);

    }

}

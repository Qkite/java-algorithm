package com.likelion.algorithm1201;

public class PowerOfWeapon {

    int calculateNumOfDivisor(int input){
        int num = 0;

        for (int i = 1; i*i <= input; i++) {
            if(i*i == input){
                num += 1; // 제곱근인 경우 하나만
            } else if (input % i ==0) {
                num += 2; // 아닌 경우 약수가 쌍이니까 2개
            }

        }
        return num;
    }

    public int solution(int number, int limit, int power) {

        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int num = calculateNumOfDivisor(i);

            if(num > limit){
                answer += power;
            } else{
                answer += num;
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        PowerOfWeapon power = new PowerOfWeapon();
        System.out.println(power.solution(5,3,2));
        System.out.println(power.solution(10,3,2));

    }
}

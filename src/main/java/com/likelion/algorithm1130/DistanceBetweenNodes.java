package com.likelion.algorithm1130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanceBetweenNodes {
    // 제일 위 부모 노드까지 찍는 것이 아니라 중간에 동일한 부모를 만나면 중단함


    int calculateDistance(int nodeNum1, int nodeNum2, int distance){
//        System.out.println(distance(nodeNum1, 0));
//        System.out.println(distance(nodeNum2, 0));
        if (nodeNum1 == nodeNum2){
            return distance;
        } else if (nodeNum1 > nodeNum2) {
            return calculateDistance(nodeNum1/2, nodeNum2, distance+1);
        } else{
            return calculateDistance(nodeNum1, nodeNum2/2, distance+1);
        }






    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = bufferedReader.readLine().split(" ");
        DistanceBetweenNodes distance = new DistanceBetweenNodes();
        int node1 = Integer.parseInt(inputs[0]);
        int node2 = Integer.parseInt(inputs[1]);

        System.out.println(distance.calculateDistance(node1, node2, 0));
    }

}

package org.example.programmers.kit;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TruckCrossBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer =0;

        int index = 0;
        int nowWeight = 0;
        Queue<Integer> bridge = new ArrayDeque<>();

        for(int i=0; i<bridge_length; i++){
            bridge.add(0);
        }


        while(index < truck_weights.length){
            answer++;

            nowWeight -= bridge.poll();

            if(nowWeight + truck_weights[index] <= weight){
                bridge.offer(truck_weights[index]);
                nowWeight += truck_weights[index];
                index++;
            }else{
                bridge.offer(0);
            }
        }

        answer += bridge.size();

        return answer;
    }
}

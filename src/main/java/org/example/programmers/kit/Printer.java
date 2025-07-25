package org.example.programmers.kit;

import java.sql.Array;
import java.util.*;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        // 여기에 구현
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Deque<int[]> priIdx = new ArrayDeque<>();

        for(int i=0; i<priorities.length; i++){
            pq.offer(priorities[i]);
            int[] temp = new int[2];
            temp[0] = priorities[i];
            temp[1] = i;
            priIdx.add(temp);
        }

        while(!pq.isEmpty()){
            int now = pq.poll();

            while(true){
                int[] temp = priIdx.pollFirst();
                if(temp[0] == now){ // 맞으면
                    answer++;
                    if(temp[1] == location){
                        return answer;
                    }
                    break;
                }else{
                    priIdx.addLast(temp);
                }
            }
        }

        return -1;
    }
}
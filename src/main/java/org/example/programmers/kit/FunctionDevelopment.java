package org.example.programmers.kit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        // 여기에 구현
        List<Integer> answer = new ArrayList<>();
        int[] endOfDay = new int[progresses.length];
        int left = 0;
        int right = 1;

        for(int i=0; i<progresses.length; i++){
            endOfDay[i] = (100-progresses[i])/speeds[i] + ((100-progresses[i])%speeds[i] != 0? 1 : 0);
        }

        while(left < endOfDay.length){
            if(right == endOfDay.length){
                answer.add(right-left);
                break;
            }

            if(endOfDay[left] < endOfDay[right]){
                answer.add(right-left);
                left = right;
                right++;
            }else{
                right++;
            }
        }

        // 5 10 1 1 20 1

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

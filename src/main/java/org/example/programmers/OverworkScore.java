package org.example.programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

//야근지수
public class OverworkScore {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i<works.length; i++){
            pq.offer(works[i]);
        }

        while(n>0){
            int num = pq.poll();
            pq.offer(--num);
            if(num<=0){
                return 0;
            }
            n--;
        }

        while(!pq.isEmpty()){
            answer += (long) Math.pow(pq.poll(), 2);
        }

        return answer;
    }
}

//입출력 예
//works	n	result
//[4, 3, 3]	4	12
//[2, 1, 2]	1	6
//  [1,1]	3	0
//입출력 예 설명
//입출력 예 #1
//n=4 일 때, 남은 일의 작업량이 [4, 3, 3] 이라면 야근 지수를 최소화하기 위해 4시간동안 일을 한 결과는 [2, 2, 2]입니다. 이 때 야근 지수는 22 + 22 + 22 = 12 입니다.
//
//입출력 예 #2
//n=1일 때, 남은 일의 작업량이 [2,1,2]라면 야근 지수를 최소화하기 위해 1시간동안 일을 한 결과는 [1,1,2]입니다. 야근지수는 12 + 12 + 22 = 6입니다.
//
//입출력 예 #3
//
//남은 작업량이 없으므로 피로도는 0입니다.
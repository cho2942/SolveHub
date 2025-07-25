package org.example.programmers;

import java.util.Comparator;
import java.util.PriorityQueue;

//야근지수
public class OverworkScore {
    public long solution(int n, int[] works) {
        int sum = 0;
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int work : works){
            sum += work;
            pq.offer(work);
        }

        if(sum < n){
            return 0;
        }

        while(n>0){
            Integer temp = pq.poll();

            temp -= 1;
            n--;
            pq.offer(temp);
        }

        while(!pq.isEmpty()){
            int now = pq.poll();

            answer += (long) Math.pow(now, 2);
        }

        return answer;
    }
}

//입출력 예
//  works	n	result
//[4, 3, 3]	4	12
//[2, 1, 2]	1	6
//  [1,1]	3	0
//입출력 예 설명
//입출력 예 #1
//n=4 일 때, 남은 일의 작업량이 [4, 3, 3] 이라면 야근 지수를 최소화하기 위해 4시간동안 일을 한 결과는 [2, 2, 2]입니다. 이 때 야근 지수는 2^2 + 2^2 + 2^2 = 12 입니다.
//
//입출력 예 #2
//n=1일 때, 남은 일의 작업량이 [2,1,2]라면 야근 지수를 최소화하기 위해 1시간동안 일을 한 결과는 [1,1,2]입니다. 야근지수는 12 + 12 + 22 = 6입니다.
//
//입출력 예 #3
//
//남은 작업량이 없으므로 피로도는 0입니다.
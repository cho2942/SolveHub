package org.example.programmers.kit;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;
        int now = 0;
        PriorityQueue<int[]> workTime = new PriorityQueue<>(Comparator.comparing(a->a[1]));
        PriorityQueue<int[]> startTime = new PriorityQueue<>(Comparator.comparing(a->a[0]));

        for(int[] job : jobs){
            startTime.offer(job);
        }

        while(!startTime.isEmpty()){

            while(!startTime.isEmpty()) {
                int[] work = startTime.poll();

                if (work[0] <= now) {
                    workTime.offer(work);
                } else {
                    startTime.offer(work);
                    break;
                }
            }


            if(!workTime.isEmpty()) {
                int[] executeWork = workTime.poll();

                answer += now - executeWork[0] + executeWork[1];
                now += executeWork[1];
            }else{
                now++;
            }
        }

        return answer/jobs.length;
    }
}

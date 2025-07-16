package org.example.programmers;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DoublePriorityQueue {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        int count =0;

        for(String str : operations){
            String[] strings = str.split(" ");

            switch (strings[0]){
                case "I" -> { // 값 추가
                    maxPq.offer(Integer.parseInt(strings[1]));
                    minPq.offer(Integer.parseInt(strings[1]));
                    count++;
                }
                case "D" -> {
                            if (strings[1].equals("1")) { // 최대값 삭제
                                maxPq.poll();
                            } else {  // 최소값 삭제
                                minPq.poll();
                            }
                }
            }
        }

        if((maxPq.size() + minPq.size()) < count){
            return new int[]{0,0};
        }
        answer[0] = maxPq.poll();
        answer[1] = minPq.poll();
        return answer;
    }
}


//"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"
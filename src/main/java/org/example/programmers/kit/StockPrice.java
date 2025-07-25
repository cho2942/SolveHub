package org.example.programmers.kit;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class StockPrice {
    public int[] solution(int[] prices) {
        // 여기에 구현
        int index = 0;
        int[] answer = new int[prices.length];
        PriorityQueue<int[]> stack = new PriorityQueue<>(Comparator.comparing(a -> -a[0]));
        stack.offer(new int[]{prices[0], 0});

        for(int i=1; i<prices.length; i++){

                while(!stack.isEmpty()){
                    if(stack.peek()[0] > prices[i]){
                        int[] temp = stack.poll();
                        answer[temp[1]] = i - temp[1];
                    }else{
                        break;
                    }
                }
                stack.offer(new int[]{prices[i],i});
        }

        while(!stack.isEmpty()){
            int[] temp = stack.poll();
            answer[temp[1]] = prices.length - temp[1]-1;
        }

        return answer;
    }
}


//[1, 2, 3, 2, 3]
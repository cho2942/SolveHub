package org.example.programmers.kit;

import java.util.*;

public class DividePowerGrid {
    static int answer;

    public int solution(int n, int[][] wires) {
        answer = Integer.MAX_VALUE;
        List<int[]> wireList = new ArrayList<>(Arrays.asList(wires));

        for(int i=0; i<wireList.size(); i++){
            int[] now = wireList.get(i);
            wireList.remove(i);

            dfs(wireList, n);

            if(i == wireList.size()-1){
            wireList.add(i, now);
            }else {
                wireList.add(i, now);
            }
        }

        return answer;
    }

    private void dfs(List<int[]> wireList, int n) {
        int[] visited = new int[n+1];
        Queue<Integer> queue = new ArrayDeque<>();
        int tempAnswer = 0;

        visited[wireList.get(0)[0]] = 1;
        visited[wireList.get(0)[1]] = 1;

        queue.offer(wireList.get(0)[0]);
        queue.offer(wireList.get(0)[1]);

        while(!queue.isEmpty()){
            int temp = queue.poll();

            for(int i=0; i<wireList.size(); i++){
                if(wireList.get(i)[0] == temp && visited[wireList.get(i)[1]] != 1){
                    queue.offer(wireList.get(i)[1]);
                    visited[wireList.get(i)[1]] = 1;
                }else if(wireList.get(i)[1] == temp && visited[wireList.get(i)[0]] != 1){
                    queue.offer(wireList.get(i)[0]);
                    visited[wireList.get(i)[0]] = 1;
                }
            }
        }

        for(int visit : visited){
            if(visit == 1){
                tempAnswer++;
            }
        }

            answer = Math.min(answer,Math.abs((n-tempAnswer) - tempAnswer));
        }
    }



//n	                    wires	                      result
//9	[[1,3],[2,3],[3,4],[4,5],[4,6],[4,7],[7,8],[7,9]]	3
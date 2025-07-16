package org.example.programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class ConnectIlands {
    public int solution(int n, int[][] k) {
        boolean[] visited = new boolean[n];
        List<int[]>[] graph = new ArrayList[n];

        for(int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int[] row : k) {
            graph[row[0]].add(new int[]{row[1], row[2]});
            graph[row[1]].add(new int[]{row[0], row[2]});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> a[1]));
        pq.offer(new int[]{0,0});

        int totalCount = 0;
        int totalNode = 0;

        while(pq.size() > 0 && totalNode < n) {
            int[] curr = pq.poll();
            int node = curr[0];
            int count = curr[1];

            if(visited[node]) {continue;}
            visited[node] = true;
            totalCount += count;
            totalNode++;

            for(int[] neighbor : graph[node]) {
               if(!visited[neighbor[0]]) {
                   pq.offer(new int[]{neighbor[0], neighbor[1]});
               }
            }

        }
        return totalCount;
    }
}

//[[0,1,1],[0,2,2],[1,2,5],[1,3,1],[2,3,8]]
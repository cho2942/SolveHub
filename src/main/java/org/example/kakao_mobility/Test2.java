package org.example.kakao_mobility;

import java.util.Arrays;

public class Test2 {
    int answer = 0;

    public int solution(int[] T, int[] A) {
        // Implement your solution here
        answer = 0;

        int[] visited = new int[T.length];

        for (int j : A) {
            dfs(T, j, visited);
        }

        return answer;
    }

    public void dfs(int[] T, int skill, int[] visited){
        if(visited[skill] == 1){
            return ;
        }
        answer++;
        visited[skill] = 1;

        dfs(T, T[skill], visited);
    }
}

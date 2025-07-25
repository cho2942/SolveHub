package org.example.programmers.kit;

public class Fatigue {
    static int answer = 0;

    public int solution(int k, int[][] dungeons) {
        int[] visited = new int[dungeons.length];

        for(int i=0; i<dungeons.length; i++) {
            if(dungeons[i][0] <= k) {
                visited[i] = 1;
                dfs(dungeons, visited, i, k - dungeons[i][1], 1);
                visited[i] = 0;
            }
        }

        return answer;
    }

    private void dfs(int[][] dungeons, int[] visited, int now, int k, int depth) {
        answer = Math.max(depth, answer);

        for(int i=0; i< dungeons.length; i++){
            if(visited[i] != 1 && dungeons[i][0] <= k){
                visited[i] = 1;
                dfs(dungeons, visited, i, k - dungeons[i][1], depth+1);
                visited[i] = 0;
            }
        }
    }

}

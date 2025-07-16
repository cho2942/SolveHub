package org.example.graph.re;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    int xi[] = {0, -1, 0, 1};
    int yi[] = {-1, 0, 1, 0};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        List<List<Integer>> answer = new ArrayList<>();

        int[][] pacific = new int[heights.length][heights[0].length]; // 0 안가봄, 1 불가능, 2 가능
        int[][] atlantic = new int[heights.length][heights[0].length]; // 0 안가봄, 1 불가능, 2 가능

        for(int i = 0; i < heights.length; i++) {
            dfs(i, 0, pacific, heights);
            dfs(i, heights[0].length -1, atlantic, heights);
        }

        for(int i = 0; i < heights[0].length; i++) {
            dfs(0, i, pacific, heights);
            dfs(heights.length -1, i, atlantic, heights);
        }

        for(int q = 0; q < pacific.length; q++) {
            for(int w = 0; w < pacific[0].length; w++) {
                if(pacific[q][w]==1 && pacific[q][w] == atlantic[q][w]) {
                    answer.add(List.of(q, w));
                }
            }
        }

        return answer;
    }

    private void dfs(int i, int j, int[][] visited, int[][] heights) {
                    System.out.println((i) + ", " + (j));
        visited[i][j] = 1;

            for(int y = 0; y < 4; y++) {
                int nextX = i + xi[y];
                int nextY = j + yi[y];
                if (nextX > -1 && nextY > -1 && nextX < visited.length && nextY < visited[0].length) {
                    if (visited[nextX][nextY] == 0 && (heights[i][j] <= heights[nextX][nextY])) {
                        dfs(nextX, nextY, visited, heights);
                    }
                }
            }
    }
}


//{1,2,2,3,5}
//{3,2,3,4,4}
//{2,4,5,3,1}
//{6,7,1,4,5}
//{5,1,1,2,4}
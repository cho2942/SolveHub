package org.example.graph;

public class NumberOfIslands {
    int[] xi = new int[]{-1, 0, 1, 0};
    int[] yi = new int[]{0, -1, 0, 1};

    public int numIslands(char[][] grid) {
        int answer = 0;

        for(int x=0; x<grid.length; x++) {
            for(int y=0; y<grid[0].length; y++) {
                if(grid[x][y] == 1) {
                    answer++;
                    dfs(x, y, grid);
                }
            }
        }
        return answer;
    }

    private void dfs(int x, int y, char[][] grid) {
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) {
            return ;
        }

        if(grid[x][y] == 0){
            return ;
        }

        grid[x][y] = 0;

        for(int i=0; i<4; i++){
            int nextX = x + xi[i];
            int nextY = y + yi[i];

            dfs(nextX, nextY, grid);
        }
    }
}

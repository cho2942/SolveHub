package org.example.kakao;

public class MazeEscapeCommands {

    boolean findAnswer = false;
    String globalAnswer = "impossible";
    private final int[] dx = {1, 0, 0, -1}; // d l r u
    private final int[] dy = {0, -1, 1, 0};
    private final String[] str = {"d", "l", "r", "u"};


    //....  1.lld
    //..S.  2.dll
    //E...    dll
    public boolean dfs(int n ,int nowX, int nowY, int r, int c, int k, StringBuilder answer){
        if(findAnswer){
            return true;
        }

        int shortAnswer = Math.abs(nowX-r)+Math.abs(nowY-c);

        if(shortAnswer>k || (shortAnswer-k)%2 != 0){
            return false;
        }

        if(k==0){
            if(nowX == r && nowY == c){
                findAnswer = true;
                globalAnswer = answer.toString();
            }else{
                return false;
            }
        }

        for(int i=0; i<4; i++){
            int nextX = nowX + dx[i];
            int nextY = nowY + dy[i];

            if(nextX >= 1 && nextX <= n && nextY >= 1 && nextY <= n){
                answer.append(str[i]);
                dfs(n, nextX, nextY, r, c, k-1, answer);
                answer.deleteCharAt(answer.length()-1);
            }
        }

        return false;
    }

    public String solution(int n, int m, int x, int y, int r, int c, int k) {
        String[][] maze = new String[n+1][m+1];
        maze[x][y] = "S";
        maze[r][c] = "E";

        findAnswer = false;
        globalAnswer = "impossible";

        StringBuilder answer = new StringBuilder();

        int shortAnswer = Math.abs(x-r)+Math.abs(y-c);
        if(shortAnswer>k || (shortAnswer-k)%2 != 0){
            return "impossible";
        }

        dfs(n, x, y, r, c ,k, answer);

        return globalAnswer;
    }
}
//1,3 3,1
//....  1.lld
//..S.  2.dll
//E...    dll

//...E  rrruu
//....
//S...

//S..E  rrr
//....
//....

//....  1.rrrd
//S...  2.drlrrr
//...E  3.rdrr
//      4.rrdr
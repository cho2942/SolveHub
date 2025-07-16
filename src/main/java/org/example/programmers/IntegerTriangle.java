package org.example.programmers;

public class IntegerTriangle {
    public int solution(int[][] triangle) {
        int answer = 0;

        for(int i=1;i<triangle.length;i++) {
            for(int j=0;j<triangle[i].length;j++) {
                if(j==0){ // 왼쪽 맨끝
                    triangle[i][j] += triangle[i-1][j];
                }else if(j==triangle[i].length-1){ // 오른쪽 맨끝
                    triangle[i][j] += triangle[i-1][j-1];
                }else{ // 가운데
                    triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
                }
            }
        }

        for(int i=0;i<triangle[triangle.length-1].length;i++) {
            answer = Math.max(answer, triangle[triangle.length-1][i]);
        }
        return answer;
    }
}


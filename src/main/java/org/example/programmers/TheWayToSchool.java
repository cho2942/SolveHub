package org.example.programmers;

import java.util.ArrayDeque;
import java.util.Queue;

//등굣길
public class TheWayToSchool {

    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[n+1][m+1];

        for(int[] puddle : puddles){
            map[puddle[1]][puddle[0]] = -1;
        }

        map[1][1] = 1;

        for(int i=1; i<n+1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if(map[i][j] == 0){
                    int temp = map[i-1][j]%1000000007 + map[i][j-1]%1000000007;
                    map[i][j] = temp%1000000007;
                }else if(map[i][j] == -1){
                    map[i][j] = 0;
                }
            }
        }

        return map[n][m];
    }
}


//가장 왼쪽 위, 즉 집이 있는 곳의 좌표는 (1, 1)로 나타내고 가장 오른쪽 아래, 즉 학교가 있는 곳의 좌표는 (m, n)으로 나타냅니다.
//
//격자의 크기 m, n과 물이 잠긴 지역의 좌표를 담은 2차원 배열 puddles이 매개변수로 주어집니다. 오른쪽과 아래쪽으로만 움직여 집에서 학교까지 갈 수 있는
// 최단경로의 개수를 1,000,000,007로 나눈 나머지를 return 하도록 solution 함수를 작성해주세요.
//
//제한사항
//격자의 크기 m, n은 1 이상 100 이하인 자연수입니다.
//m과 n이 모두 1인 경우는 입력으로 주어지지 않습니다.
//물에 잠긴 지역은 0개 이상 10개 이하입니다.
//집과 학교가 물에 잠긴 경우는 입력으로 주어지지 않습니다.
//입출력 예
//m	n	puddles	return
//4	3	[[2, 2]]	4

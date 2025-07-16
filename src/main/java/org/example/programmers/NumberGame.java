package org.example.programmers;

import java.util.Arrays;

//숫자게임
public class NumberGame {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        int left = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<A.length; i++){
            while(true){
                if(left == B.length){
                    break;
                }
                if(A[i] < B[left]){
                    left++;
                    answer++;
                    break;
                }
                left++;
            }
        }

        return answer;
    }
}
//
//입출력 예
//A	B	result
//[5,1,3,7]	[2,2,6,8]	3
//[2,2,2,2]	[1,1,1,1]	0
//입출력 예 설명
//입출력 예 #1
//A 팀은 숫자 5를 부여받은 팀원이 첫번째로 출전하고, 이어서 1,3,7을 부여받은 팀원들이 차례대로 출전합니다.
//B 팀원들을 4번, 2번, 3번, 1번의 순서대로 출전시킬 경우 팀원들이 부여받은 숫자들은 차례대로 8,2,6,2가 됩니다. 그러면, 첫 번째, 두 번째, 세 번째 경기에서 승리하여 3점을 얻게 되고, 이때가 최대의 승점입니다.
//
//입출력 예 #2
//B 팀원들을 어떤 순서로 출전시켜도 B팀의 승점은 0점입니다.
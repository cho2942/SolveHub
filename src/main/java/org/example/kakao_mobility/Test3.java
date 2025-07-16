package org.example.kakao_mobility;

public class Test3 {
    public int solution(int[] A) {
        // Implement your solution here
        int answer = 0;
        int left = 0;
        int even = Integer.MIN_VALUE;
        int odd = Integer.MIN_VALUE;

        if(A.length == 1)
            return 1;
        if(A.length == 2)
            return 2;

        for(int right=0; right<A.length; right++) {
            int now = A[right];

            if (right % 2 == 1) { // 홀수
                if (odd == Integer.MIN_VALUE || odd == now) {
                    odd = now;
                }else{ // 깨짐
                    left = right-1;
                    odd = now;
                    even = A[right-1];
                }
            }else{ // 짝수
                if (even == Integer.MIN_VALUE || even == now) {
                    even = now;
                }else{ // 깨짐
                    left = right-1;
                    even = now;
                    odd = A[right-1];
                }
            }

            int nowLen = right - left + 1;
            if(answer < nowLen){
                answer = nowLen;
            }
        }

        return answer;
    }
}

package org.example.programmers.kit;

import java.util.Arrays;

public class Joystick {
    public int solution(String name) {
        int answer = 0;
        int[] dp = new int[26];
        int temp = 1;
        int left = 0;
        int right = 0;
        int lengthAnswer = 0;
        int lastLeft = 0;
        int lastRight = 0;


        for(int i=0; i<13; i++){
            dp[i] = i;
        }
        for(int i=25; i>12; i--){
            dp[i] = temp++;
        }

        for(char ch : name.toCharArray()){
            answer += dp[ch-'A'];
        }

        while(right < name.length()){
            if(name.charAt(right) == 'A'){
                if(lengthAnswer < right-left+1){
                    lengthAnswer = right-left+1;
                    lastRight = right;
                    lastLeft = left;
                }
                right++;
            }else{
                right++;
                left=right;
            }
        }

//        BBBAAAAB  left = 3  right = 6     8  4번  Math.min(3, 7-6)*2 + Math.max(3, 7-6)

        int i = Math.max((Math.min(lastLeft - 1, name.length() - lastRight) * 2), 0);
        return answer + Math.min(name.length()-1, i + Math.max(lastLeft-1, name.length()-lastRight)-1);
    }
}

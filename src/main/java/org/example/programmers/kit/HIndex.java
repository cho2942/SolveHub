package org.example.programmers.kit;

import java.util.Arrays;

public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        int left = 0;
        int right = citations.length-1;

        while(left<right){
            int middle = left + (right/2)+1;

            if(middle <= citations[middle] && citations.length-middle >= citations[middle]){

            }
        }

        return answer;
    }
}


//1 3 5
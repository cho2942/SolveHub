package org.example.graph.re;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int answer = 0;

        for (int num : nums) {
            set.add(num);
        }


        for(int num : set){
            if(!set.contains(num-1)){
                int curr = num;
                int nowAnswer = 0;

                while(set.contains(curr++)){
                    nowAnswer += 1;
                }

                if(answer < nowAnswer){
                    answer = nowAnswer;
                }
            }
        }
        return answer;
    }
}



//
//Example 1:
//
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

//Example 2:
//
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9

//Example 3:
//
//Input: nums = [1,0,1,2]
//Output: 3
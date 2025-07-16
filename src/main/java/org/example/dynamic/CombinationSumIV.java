package org.example.dynamic;

import java.util.Arrays;

public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];

        dp[0] = 1;
        for(int i=0;i<=target;i++){
            for(int j=0; j<nums.length;j++){
                if(dp[i]!=0 && i+nums[j]<=target){
                    dp[i+nums[j]] += dp[i];
                }
            }
        }

        return dp[target];
    }
}


//Input: nums = [1,2,3], target = 4
//Output: 7
//Explanation:
//The possible combination ways are:
//        (1, 1, 1, 1)
//        (1, 1, 2)
//        (1, 2, 1)
//        (1, 3)
//        (2, 1, 1)
//        (2, 2)
//        (3, 1)
//Note that different sequences are counted as different combinations.
//        Example 2:
//
//Input: nums = [9], target = 3
//Output: 0
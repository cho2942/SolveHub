package org.example.array.re;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Example 2:
//
//Input: nums = [1]
//Output: 1
//Explanation: The subarray [1] has the largest sum 1.
//Example 3:
//
//Input: nums = [5,4,-1,7,8]
//Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
//
//
//Constraints:
//
//        1 <= nums.length <= 105
//        -104 <= nums[i] <= 104

//
//int currentSum = 0;
//int maxSum = Integer.MIN_VALUE;
//
//        for(int i=0; i<nums.length; i++){
//currentSum = Math.max(currentSum + nums[i], nums[i]);
//maxSum = Math.max(maxSum, currentSum);
//        }
//
//                return maxSum;
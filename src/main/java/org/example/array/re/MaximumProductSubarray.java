package org.example.array.re;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int hereMax = nums[0];
        int hereMin = nums[0];
        int maxSoFar = nums[0];

        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];

            int tempMax = hereMax;

            hereMax = Math.max(curr, Math.max(hereMax * curr, hereMin * curr));
            hereMin = Math.min(curr, Math.min(tempMax * curr, hereMin * curr));

            maxSoFar = Math.max(maxSoFar, hereMax);
        }

        return maxSoFar;
    }
}

//Given an integer array nums, find a subarray that has the largest product, and return the product.
//
//The test cases are generated so that the answer will fit in a 32-bit integer.
//
//
//
//Example 1:
//
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
//Example 2:
//
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
//
//
//Constraints:
//
//        1 <= nums.length <= 2 * 10^4
//        -10 <= nums[i] <= 10
//The product of any subarray of nums is guaranteed to fit in a 32-bit integer.
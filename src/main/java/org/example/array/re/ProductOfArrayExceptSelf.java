package org.example.array.re;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                result[j]*=nums[i];
            }
        }

        for(int i=nums.length-1; i>=0; i--){
            for(int j=i-1; j>=0; j--){
                result[j]*=nums[i];
            }
        }

        return result;
    }
}


//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]
//
//
//Constraints:
//        2 <= nums.length <= 105
//        -30 <= nums[i] <= 30
//The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

//

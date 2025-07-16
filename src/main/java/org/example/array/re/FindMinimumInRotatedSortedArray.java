package org.example.array.re;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while(left < right) {
            int middle = left + (right - left) / 2;

            if(nums[right] < nums[middle]){ // 최소값 오른쪽 ( 오른쪽 정렬 안됨 )
                left = middle + 1;
            }else{ // 왼쪽이거나 middle
                right = middle;
            }
        }

        return nums[left];
    }
}
//Example 1:
//
//Input: nums = [3,4,5,1,2]
//Output: 1
//Explanation: The original array was [1,2,3,4,5] rotated 3 times.
//        Example 2:
//
//Input: nums = [4,5,6,7,0,1,2]
//Output: 0
//Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
//        Example 3:
//
//Input: nums = [11,13,15,17]
//Output: 11
//Explanation: The original array was [11,13,15,17] and it was rotated 4 times.


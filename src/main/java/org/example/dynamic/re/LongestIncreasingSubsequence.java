package org.example.dynamic.re;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        List<Integer> dp = new ArrayList<>();

        for (int num : nums) {
            int index = binarySearch(dp, num);

            if (index == dp.size()) {
                dp.add(num);  // num을 dp 배열의 끝에 추가
            } else {
                dp.set(index, num);  // 더 작은 값이 있으면 그 값을 대체
            }
        }

        return dp.size();  // dp의 길이가 LIS의 길이
    }

    // 이진 탐색을 이용하여 적절한 위치를 찾아 반환
    private static int binarySearch(List<Integer> dp, int target) {
        int left = 0, right = dp.size();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (dp.get(mid) >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
// 1 2 0 3 4 5
// 6 7 8 1 2 3 4 5
//Given an integer array nums, return the length of the longest strictly increasing subsequence.

//Example 1:
//
//Input: nums = [10,9,2,5,3,7,101,18]
//Output: 4
//Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.

//Example 2:
//
//Input: nums = [0,1,0,3,2,3]
//Output: 4

//Example 3:
//
//Input: nums = [7,7,7,7,7,7,7]
//Output: 1
//
//
//Constraints:
//
//        1 <= nums.length <= 2500
//        -104 <= nums[i] <= 104
//
//Follow up: Can you come up with an algorithm that runs in O(n log(n)) time complexity?




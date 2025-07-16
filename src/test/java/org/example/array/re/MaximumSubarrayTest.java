package org.example.array.re;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaximumSubarrayTest {

    MaximumSubarray maxSubarray = new MaximumSubarray();
    @Test
    void MaximumSubarray_re0430Test() {
        // given
        // when
        int answer;
        answer = maxSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});

        // then
        assertThat(answer).isEqualTo(6);

        answer = maxSubarray.maxSubArray(new int[]{1});

        assertThat(answer).isEqualTo(1);

        answer = maxSubarray.maxSubArray(new int[]{5,4,-1,7,8});

        assertThat(answer).isEqualTo(23);

        answer = maxSubarray.maxSubArray(new int[]{1,2,-1,-2,2,1,-2,1,4,-5,4});

        assertThat(answer).isEqualTo(6);

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

}
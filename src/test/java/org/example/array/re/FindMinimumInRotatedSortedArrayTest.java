package org.example.array.re;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMinimumInRotatedSortedArrayTest {

    FindMinimumInRotatedSortedArray find = new FindMinimumInRotatedSortedArray();

    @Test
    void findMin() {
        int answer = find.findMin(new int[]{3,4,5,1,2});
        Assertions.assertThat(answer).isEqualTo(1);
        answer = find.findMin(new int[]{4,5,6,7,0,1,2});
        Assertions.assertThat(answer).isEqualTo(0);
        answer = find.findMin(new int[]{11, 13, 15, 17});
        Assertions.assertThat(answer).isEqualTo(11);
        answer = find.findMin(new int[]{2, 1});
        Assertions.assertThat(answer).isEqualTo(1);
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

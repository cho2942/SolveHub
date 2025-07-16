package org.example.graph.re;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence sequence = new LongestConsecutiveSequence();

    @Test
    void longestConsecutive() {
        Assertions.assertThat(sequence.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2})).isEqualTo(4);
        Assertions.assertThat(sequence.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0 ,1})).isEqualTo(9);
        Assertions.assertThat(sequence.longestConsecutive(new int[]{1, 0, 1, 2})).isEqualTo(3);
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
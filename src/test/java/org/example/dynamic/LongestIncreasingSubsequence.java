package org.example.dynamic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestIncreasingSubsequence {

    org.example.dynamic.re.LongestIncreasingSubsequence longestIncreasingSubsequence = new org.example.dynamic.re.LongestIncreasingSubsequence();

    @Test
    void LongestIncreasingSubsequenceTest() {
        // given
        int answer = 0;

        answer = longestIncreasingSubsequence.lengthOfLIS(new int[]{6, 7, 8, 1, 2, 3, 4, 5});
        Assertions.assertThat(answer).isEqualTo(5);

        answer = longestIncreasingSubsequence.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18});
        Assertions.assertThat(answer).isEqualTo(4);
        // when
        answer = longestIncreasingSubsequence.lengthOfLIS(new int[]{0,1,0,3,2,3});
        Assertions.assertThat(answer).isEqualTo(4);

        // then
        answer = longestIncreasingSubsequence.lengthOfLIS(new int[]{7,7,7,7,7,7,7});
        Assertions.assertThat(answer).isEqualTo(1);

    }
}
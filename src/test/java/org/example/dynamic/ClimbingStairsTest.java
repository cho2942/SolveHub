package org.example.dynamic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    ClimbingStairs climbingStairs = new ClimbingStairs();
    @Test
    void ClimbingStairsTest() {
        int answer = 0;
        // given
        answer = climbingStairs.climbStairs(2);
        assertThat(answer).isEqualTo(2);
        // when
        answer = climbingStairs.climbStairs(3);
        assertThat(answer).isEqualTo(3);

        // then
    }
}
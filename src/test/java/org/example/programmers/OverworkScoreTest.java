package org.example.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverworkScoreTest {

    OverworkScore overworkScore = new OverworkScore();

    @Test
    void solution() {
        Assertions.assertThat(overworkScore.solution(4, new int[]{4,3,3})).isEqualTo(12);
        Assertions.assertThat(overworkScore.solution(1, new int[]{2,1,2})).isEqualTo(6);
        Assertions.assertThat(overworkScore.solution(3, new int[]{1,1})).isEqualTo(0);
    }
}
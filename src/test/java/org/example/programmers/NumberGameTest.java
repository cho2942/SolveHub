package org.example.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGameTest {

    NumberGame numberGame = new NumberGame();
    @Test
    void solution() {
        Assertions.assertThat(numberGame.solution(new int[]{5,1,3,7}, new int[]{2,2,6,8})).isEqualTo(3);
        Assertions.assertThat(numberGame.solution(new int[]{2,2,2,2}, new int[]{1,1,1,1})).isEqualTo(0);
    }
}
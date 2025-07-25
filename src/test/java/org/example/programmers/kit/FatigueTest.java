package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FatigueTest {

    Fatigue fatigue = new Fatigue();

    @Test
    void solution() {
        Assertions.assertThat(fatigue.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}})).isEqualTo(3);
    }
}
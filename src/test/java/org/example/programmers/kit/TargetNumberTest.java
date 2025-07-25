package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetNumberTest {

    TargetNumber targetNumber = new TargetNumber();

    @Test
    void solution() {
        Assertions.assertThat(targetNumber.solution(new int[]{1, 1, 1, 1, 1}, 3)).isEqualTo(5);
    }
}
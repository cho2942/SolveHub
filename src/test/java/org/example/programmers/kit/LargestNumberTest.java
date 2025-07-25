package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {

    LargestNumber largestNumber = new LargestNumber();

    @Test
    void solution() {
        Assertions.assertThat(largestNumber.solution(new int[]{6, 10, 2})).isEqualTo("6210");
        Assertions.assertThat(largestNumber.solution(new int[]{0, 0, 0})).isEqualTo("0");
    }
}
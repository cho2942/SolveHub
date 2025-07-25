package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HIndexTest {
    HIndex hIndex = new HIndex();

    @Test
    void solution() {
        Assertions.assertThat(hIndex.solution(new int[]{3, 0, 6, 1, 5})).isEqualTo(3);
    }
}
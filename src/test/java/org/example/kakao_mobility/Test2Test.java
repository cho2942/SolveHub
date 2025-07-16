package org.example.kakao_mobility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2Test {

    Test2 test2 = new Test2();

    @Test
    void solution() {
        Assertions.assertThat(test2.solution(new int[]{0,0,0,0,2,3,3}, new int[]{2, 5, 6})).isEqualTo(5);
        Assertions.assertThat(test2.solution(new int[]{0, 0, 1, 2}, new int[]{1, 2})).isEqualTo(3);
        Assertions.assertThat(test2.solution(new int[]{0, 3, 0, 0, 5, 0 ,5}, new int[]{4, 2, 6, 1, 0})).isEqualTo(7);
    }
}
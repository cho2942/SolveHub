package org.example.kakao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ChoiceToDiceTest {

    ChoiceToDice choiceToDice = new ChoiceToDice();

    @Test
    void solution() {
        assertThat(choiceToDice.solution(new int[][]{{1, 2, 3, 4, 5, 6}, {3, 3, 3, 3, 4, 4}, {1, 3, 3, 4, 4, 4}, {1, 1, 4, 4, 5, 5}})).isEqualTo(new int[]{1,4});
        assertThat(choiceToDice.solution(new int[][]{{1, 2, 3, 4, 5, 6}, {2, 2, 4, 4, 6, 6}})).isEqualTo(new int[]{2});
        assertThat(choiceToDice.solution(new int[][]{{40, 41, 42, 43, 44, 45}, {43, 43, 42, 42, 41, 41}, {1, 1, 80, 80, 80, 80}, {70, 70, 1, 1, 70, 70}})).isEqualTo(new int[]{1,3});
    }
}
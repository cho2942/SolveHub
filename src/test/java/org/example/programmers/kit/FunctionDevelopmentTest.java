package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FunctionDevelopmentTest {
    FunctionDevelopment functionDevelopment = new FunctionDevelopment();

    @Test
    void solution() {
        Assertions.assertThat(functionDevelopment.solution(new int[]{93,30,55}, new int[]{1,30,5})).isEqualTo(new int[]{2,1});
        Assertions.assertThat(functionDevelopment.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})).isEqualTo(new int[]{1, 3, 2});
    }
}
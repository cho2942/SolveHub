package org.example.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerTriangleTest {

    IntegerTriangle triangle = new IntegerTriangle();
    @Test
    void solution() {
        Assertions.assertThat(triangle.solution(new int[][]{{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}})).isEqualTo(30);
    }
}
package org.example.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedCameraTest {

    SpeedCamera speedCamera = new SpeedCamera();

    @Test
    void solution() {
        Assertions.assertThat(speedCamera.solution(new int[][]{{-20, -15},{-14, -5},{-18, -13},{-5, -3}})).isEqualTo(2);
    }
}
package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividePowerGridTest {

    DividePowerGrid dividePowerGrid = new DividePowerGrid();

    @Test
    void solution() {
//        Assertions.assertThat(dividePowerGrid.solution(9, new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}})).isEqualTo(3);
//        Assertions.assertThat(dividePowerGrid.solution(9, new int[][]{{1,3},{2,3},{3,4},{4,5},{5,6},{6,7},{7,8},{8,9}})).isEqualTo(1);
//        Assertions.assertThat(dividePowerGrid.solution(7, new int[][]{{1,2},{2,3},{3,4},{4,5},{4,6},{4,7}})).isEqualTo(1);
//        Assertions.assertThat(dividePowerGrid.solution(7, new int[][]{{1,2},{1,3},{2,4},{3,5},{5,6},{5,7}})).isEqualTo(1);
//        Assertions.assertThat(dividePowerGrid.solution(4, new int[][]{{1,2},{3,4},{2,3}})).isEqualTo(0);
        Assertions.assertThat(dividePowerGrid.solution(6, new int[][]{{1,2},{3,4},{5,6},{1,3},{3,5}})).isEqualTo(2);
    }
}
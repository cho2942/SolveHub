package org.example.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectIlandsTest {

    ConnectIlands connectIlands = new ConnectIlands();

    @Test
    void solution() {
        Assertions.assertThat(connectIlands.solution(4, new int[][]{{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}})).isEqualTo(4);
    }
}
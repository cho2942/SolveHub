package org.example.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NetworkTest {

    Network network = new Network();

    @Test
    void solution() {
        Assertions.assertThat(network.solution(3, new int[][]{{1,1,0},{1,1,0},{0,0,1}})).isEqualTo(2);
        Assertions.assertThat(network.solution(3, new int[][]{{1,1,0},{1,1,1},{0,1,1}})).isEqualTo(1);
    }
}


//        3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	2
//        3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]	1
package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiskControllerTest {

    DiskController diskController = new DiskController();

    @Test
    void solution() {

        Assertions.assertThat(diskController.solution(new int[][]{{0,3},{1,9},{2,6}})).isEqualTo(9);


    }
}
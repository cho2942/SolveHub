package org.example.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheWayToSchoolTest {

    TheWayToSchool theWayToSchool = new TheWayToSchool();

    @Test
    void solution() {
        Assertions.assertThat(theWayToSchool.solution(4,3,new int[][]{{2,2}})).isEqualTo(4);
    }
}
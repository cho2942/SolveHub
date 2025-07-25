package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HateSameNumberTest {

    HateSameNumber hateSameNumber = new HateSameNumber();

    @Test
    void solution() {
        Assertions.assertThat(hateSameNumber.solution(new int[]{1,1,3,3,0,1,1})).isEqualTo(new int[]{1,3,0,1});
        Assertions.assertThat(hateSameNumber.solution(new int[]{4,4,4,3,3})).isEqualTo(new int[]{4,3});
    }
}
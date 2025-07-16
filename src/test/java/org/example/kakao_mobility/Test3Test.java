package org.example.kakao_mobility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3Test {

    Test3 test3 = new Test3();

    @Test
    void solution() {
        Assertions.assertThat(test3.solution(new int[]{3,2,3,2,3})).isEqualTo(5);
        Assertions.assertThat(test3.solution(new int[]{7,4,-2,4,-2,-9})).isEqualTo(4);
        Assertions.assertThat(test3.solution(new int[]{7,-5-5-5,7,-1,7})).isEqualTo(3);
        Assertions.assertThat(test3.solution(new int[]{7,-5-5-5,7,-1,7,-1000000000,-1000000000,-1000000000,-1000000000,-1000000000,-1000000000,-1000000000,-1000000000})).isEqualTo(8);
        Assertions.assertThat(test3.solution(new int[]{1,2,3})).isEqualTo(2);
        Assertions.assertThat(test3.solution(new int[]{})).isEqualTo(0);
    }
}
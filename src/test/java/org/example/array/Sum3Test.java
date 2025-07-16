package org.example.array;

import org.example.array.re.Sum3;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class Sum3Test {

    Sum3 sum3 = new Sum3();

    @Test
    void Sum3Test() {
        List<List<Integer>> answer;
        // given
        answer = sum3.threeSum(new int[]{-1,0,1,2,-1,-4});
        assertThat(answer).isEqualTo(List.of(List.of(-1,-1,2), List.of(-1,0,1)));

        answer = sum3.threeSum(new int[]{1, 2, -2, -1});
        assertThat(answer).isEqualTo(List.of());

        answer = sum3.threeSum(new int[]{0, 0, 0, 0});
        assertThat(answer).isEqualTo(List.of(List.of(0, 0, 0)));
    }

}
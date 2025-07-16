package org.example.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    ContainerWithMostWater container = new ContainerWithMostWater();

    @Test
    void ContainerWithMostWaterTest() {
        // given
        // when
        int answer = container.maxArea(new int[]{1,8,6,2,5,4,8,3,7});

        // then
        assertThat(answer).isEqualTo(49);

        answer = container.maxArea(new int[]{1,1});

        // then
        assertThat(answer).isEqualTo(1);
    }

}
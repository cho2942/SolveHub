package org.example.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIVTest {

    CombinationSumIV combinationSumIV = new CombinationSumIV();

    @Test
    void combinationSum4() {
        int answer;
        answer = combinationSumIV.combinationSum4(new int[]{1, 2, 3}, 4);
        assertThat(answer).isEqualTo(7);

        answer = combinationSumIV.combinationSum4(new int[]{9}, 3);
        assertThat(answer).isEqualTo(0);
    }
}
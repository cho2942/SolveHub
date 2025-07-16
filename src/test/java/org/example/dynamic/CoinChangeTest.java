package org.example.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    CoinChange coinChange = new CoinChange();

    @Test
    void CoinChangeTest() {
        // given
        int answer = 0;
        answer =coinChange.coinChange(new int[]{1,2,5}, 11);
        assertThat(answer).isEqualTo(3);

        answer =coinChange.coinChange(new int[]{2}, 3);
        assertThat(answer).isEqualTo(-1);

        answer =coinChange.coinChange(new int[]{1}, 0);
        assertThat(answer).isEqualTo(0);

        answer =coinChange.coinChange(new int[]{2}, 1);
        assertThat(answer).isEqualTo(-1);
    }

}
package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockPriceTest {

    StockPrice stockPrice = new StockPrice();

    @Test
    void solution() {
        Assertions.assertThat(stockPrice.solution(new int[]{1,2,3,2,3})).isEqualTo(new int[]{4,3,1,1,0});
    }
}
package org.example.heap;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

    @Test
    void topKFrequent() {
        Assertions.assertThat(topKFrequentElements.topKFrequent(new int[]{1,1,1,1,2,2,2,3,3}, 2)).isEqualTo(new int[]{1,2});
    }
}
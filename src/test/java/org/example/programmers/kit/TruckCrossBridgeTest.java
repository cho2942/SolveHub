package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckCrossBridgeTest {

    TruckCrossBridge truckCrossBridge = new TruckCrossBridge();

    @Test
    void solution() {
        Assertions.assertThat(truckCrossBridge.solution(2, 10, new int[]{7,4,5,6})).isEqualTo(8);
        Assertions.assertThat(truckCrossBridge.solution(100, 100, new int[]{10})).isEqualTo(101);
        Assertions.assertThat(truckCrossBridge.solution(10, 10, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10})).isEqualTo(101);
    }
}
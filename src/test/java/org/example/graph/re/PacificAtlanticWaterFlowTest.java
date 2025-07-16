package org.example.graph.re;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PacificAtlanticWaterFlowTest {

    PacificAtlanticWaterFlow pacificAtlanticWaterFlow = new PacificAtlanticWaterFlow();

    @Test
    void pacificAtlantic() {
//        Assertions.assertThat(pacificAtlanticWaterFlow.pacificAtlantic(new int[][]{{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}}))
//                .isEqualTo(List.of(List.of(0,4),List.of(1,3),List.of(1,4),List.of(2,2),List.of(3,0),List.of(3,1),List.of(4,0)));
//
//        Assertions.assertThat(pacificAtlanticWaterFlow.pacificAtlantic(new int[][]{{1,1},{1,1},{1,1}}))
//                .isEqualTo(List.of(List.of(0,0),List.of(0,1),List.of(1,0),List.of(1,1),List.of(2,0),List.of(2,1)));

        Assertions.assertThat(pacificAtlanticWaterFlow.pacificAtlantic(new int[][]{{10,10,10},{10,1,10},{10,10,10}}))
                .isEqualTo(List.of(List.of(0,0),List.of(0,1),List.of(0,2),List.of(1,0),List.of(1,2),List.of(2,0),List.of(2,1),List.of(2,2)));
    }
}
package org.example.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TravelRouteTest {

    TravelRoute travelRoute = new TravelRoute();

    @Test
    void solution() {
//        Assertions.assertThat(travelRoute.solution(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}})).isEqualTo(new String[]{"ICN", "JFK", "HND", "IAD"});
//        Assertions.assertThat(travelRoute.solution(new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}})).isEqualTo(new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"});
        Assertions.assertThat(travelRoute.solution(new String[][]{{"ICN", "A"}, {"ICN", "B"}, {"B", "ICN"}})).isEqualTo(new String[]{"ICN", "B", "ICN", "A"});
    }
}
//
//[["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]]	["ICN", "JFK", "HND", "IAD"]
//        [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL","SFO"]]	["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"]
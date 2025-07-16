package org.example.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheBestCollectionTest {

    TheBestCollection theBestCollection = new TheBestCollection();

    @Test
    void solution() {
        Assertions.assertThat(theBestCollection.solution(2, 9)).isEqualTo(new int[]{4,5});
        Assertions.assertThat(theBestCollection.solution(2, 1)).isEqualTo(new int[]{-1});
        Assertions.assertThat(theBestCollection.solution(2, 8)).isEqualTo(new int[]{4,4});
    }
}
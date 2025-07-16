package org.example.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublePriorityQueueTest {

    DoublePriorityQueue doublePriorityQueue = new DoublePriorityQueue();

    @Test
    void solution() {
//        Assertions.assertThat(doublePriorityQueue.solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"})).isEqualTo(new int[]{0, 0});
        Assertions.assertThat(doublePriorityQueue.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"})).isEqualTo(new int[]{333, -45});
    }
}
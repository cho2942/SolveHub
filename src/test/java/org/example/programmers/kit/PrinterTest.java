package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    Printer printer = new Printer();

    @Test
    void solution() {
        Assertions.assertThat(printer.solution(new int[]{2,1,3,2}, 2)).isEqualTo(1);
        Assertions.assertThat(printer.solution(new int[]{1, 1, 9, 1, 1, 1}, 0)).isEqualTo(5);
    }
}
package org.example.binary;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.*;

class NumberOf1BitsTest {
    NumberOf1Bits numberOf1Bits = new NumberOf1Bits();

    @Test
    void NumberOf1BitsTest() {
        // given
        int answer = numberOf1Bits.hammingWeight(11);
        Assertions.assertThat(answer).isEqualTo(3);
        answer = numberOf1Bits.hammingWeight(128);
        Assertions.assertThat(answer).isEqualTo(1);
        answer = numberOf1Bits.hammingWeight(2147483645);
        Assertions.assertThat(answer).isEqualTo(30);
    }
}
package org.example.binary;

import org.assertj.core.api.Assertions;
import org.example.binary.re.SumOfTwoIntegers_re0520;
import org.junit.jupiter.api.Test;

class SumOfTwoIntegers_re0520Test {

    SumOfTwoIntegers_re0520 sumOfTwoIntegers = new SumOfTwoIntegers_re0520();

    @Test
    void getSum() {
        int answer = sumOfTwoIntegers.getSum(1,2);
        Assertions.assertThat(answer).isEqualTo(3);

        answer = sumOfTwoIntegers.getSum(2,3);
        Assertions.assertThat(answer).isEqualTo(5);
    }
}


//Given two integers a and b, return the sum of the two integers without using the operators + and -.
//
//Example 1:
//
//Input: a = 1, b = 2
//Output: 3
//Example 2:
//
//Input: a = 2, b = 3
//Output: 5
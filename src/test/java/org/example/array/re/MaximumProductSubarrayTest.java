package org.example.array.re;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaximumProductSubarrayTest {

    MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();

    @Test
    void maxProduct() {
        int answer = maximumProductSubarray.maxProduct(new int[]{2,3,-2,4});

        assertThat(answer).isEqualTo(6);

        answer = maximumProductSubarray.maxProduct(new int[]{-2,0,-1});

        assertThat(answer).isEqualTo(0);

    }
}
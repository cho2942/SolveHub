package org.example.array.re;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();

    @Test
    void productExceptSelf() {
        Assertions.assertThat(product.productExceptSelf(new int[]{1,2,3,4})).isEqualTo(new int[]{24,12,8,6});
    }
}


//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
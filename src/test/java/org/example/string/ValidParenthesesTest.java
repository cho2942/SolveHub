package org.example.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void isValid() {
        assertThat(validParentheses.isValid("()")).isEqualTo(true);
        assertThat(validParentheses.isValid("()[]{}")).isEqualTo(true);
        assertThat(validParentheses.isValid("(]")).isEqualTo(false);
        assertThat(validParentheses.isValid("([])")).isEqualTo(true);
    }
}
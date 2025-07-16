package org.example.string;

import org.assertj.core.api.Assertions;
import org.example.string.re.ValidPalindrome;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void isPalindrome() {
        Assertions.assertThat(validPalindrome.isPalindrome("A man, a plan, a canal: Panama")).isEqualTo(true);
        Assertions.assertThat(validPalindrome.isPalindrome("race a car")).isEqualTo(false);
        Assertions.assertThat(validPalindrome.isPalindrome("abb")).isEqualTo(false);
//        Assertions.assertThat(validPalindrome.isPalindrome(" ")).isEqualTo(true);
    }
}
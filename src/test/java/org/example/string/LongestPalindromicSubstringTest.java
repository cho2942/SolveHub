package org.example.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    void longestPalindrome() {
        Assertions.assertThat(longestPalindromicSubstring.longestPalindrome("babad")).isEqualTo("bab");
        Assertions.assertThat(longestPalindromicSubstring.longestPalindrome("cbbd")).isEqualTo("bb");
        Assertions.assertThat(longestPalindromicSubstring.longestPalindrome("ccc")).isEqualTo("ccc");
    }
}
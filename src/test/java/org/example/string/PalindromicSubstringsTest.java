package org.example.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromicSubstringsTest {

    PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();

    @Test
    void countSubstrings() {
//        Assertions.assertThat(palindromicSubstrings.countSubstrings("hello")).isEqualTo(6);
//        Assertions.assertThat(palindromicSubstrings.countSubstrings("abc")).isEqualTo(3);
        Assertions.assertThat(palindromicSubstrings.countSubstrings("aaa")).isEqualTo(6);
    }
}

//Input: s = "abc"
//Output: 3
//Explanation: Three palindromic strings: "a", "b", "c".
//Example 2:
//
//Input: s = "aaa"
//Output: 6
//Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
package org.example.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void lengthOfLongestSubstring() {
        int answer;
        answer = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb");
        Assertions.assertThat(answer).isEqualTo(3);

        answer = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb");
        Assertions.assertThat(answer).isEqualTo(1);

        answer = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
        Assertions.assertThat(answer).isEqualTo(3);

        answer = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" ");
        Assertions.assertThat(answer).isEqualTo(1);

        answer = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("tmmzuxt");
        Assertions.assertThat(answer).isEqualTo(5);
    }
}

//Given a string s, find the length of the longest substring without duplicate characters.
//
//
//
//        Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
//        Constraints:
//
//        0 <= s.length <= 5 * 104
//s consists of English letters, digits, symbols and spaces.
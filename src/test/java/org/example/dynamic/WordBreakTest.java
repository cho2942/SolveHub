package org.example.dynamic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {
        WordBreak wordBreak = new WordBreak();
    @Test
    void wordBreak() {

        boolean answer;
        answer = wordBreak.wordBreak("leetcode", List.of("leet","code"));
        assertThat(answer).isEqualTo(true);

        answer = wordBreak.wordBreak("applepenapple", List.of("apple","pen"));
        assertThat(answer).isEqualTo(true);

        answer = wordBreak.wordBreak("catsandog", List.of("cats","dog","sand","and","cat"));
        assertThat(answer).isEqualTo(false);

        answer = wordBreak.wordBreak("bb", List.of("a","b","bbb","bbbb"));
        assertThat(answer).isEqualTo(true);

    }
}

//Input: s = "leetcode", wordDict = ["leet","code"]
//Output: true
//Explanation: Return true because "leetcode" can be segmented as "leet code".
//Example 2:
//
//Input: s = "applepenapple", wordDict = ["apple","pen"]
//Output: true
//Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
//Note that you are allowed to reuse a dictionary word.
//Example 3:
//
//Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
//Output: false

//Constraints:
//
//        1 <= s.length <= 300
//        1 <= wordDict.length <= 1000
//        1 <= wordDict[i].length <= 20
//s and wordDict[i] consist of only lowercase English letters.
//All the strings of wordDict are unique.
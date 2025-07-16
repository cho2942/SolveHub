package org.example.string;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] sArr = new int[26];
        int[] tArr = new int[26];

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            sArr[s.charAt(i) - 'a'] += 1;
            tArr[t.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }
        return true;
    }
}


//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true
//
//Example 2:
//Input: s = "rat", t = "car"
//Output: false
//
//Constraints:
//
//        1 <= s.length, t.length <= 5 * 104
//s and t consist of lowercase English letters.

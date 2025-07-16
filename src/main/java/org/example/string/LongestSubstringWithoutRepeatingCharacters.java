package org.example.string;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int answer = 1;
        int curr = 1;
        int[] dp = new int[200];
        if(s.isEmpty()){
            return 0;
        }
        dp[s.charAt(0)] = 1;
        for(int i=1; i<s.length(); i++) {
            if(dp[s.charAt(i)] == 0){
                curr++;
                dp[s.charAt(i)] = i+1;
            }else{
                if(curr > i-dp[s.charAt(i)]){
                    curr = i-dp[s.charAt(i)]+1;
                }
                if(curr < i-dp[s.charAt(i)]){
                    curr++;
                }
                dp[s.charAt(i)] = i+1;
            }

            if(curr > answer){
                answer = curr;
            }
        }
        return answer;
    }
}

//abcadbcbb 4

//Given a string s, find the length of the longest substring without duplicate characters.
//Example 1:
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
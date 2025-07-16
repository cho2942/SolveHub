package org.example.dynamic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()+1];
        int maxLength = 0;
        HashSet<String> set = new HashSet<>(wordDict);
        for(String word : wordDict) {
            maxLength = Math.max(maxLength, word.length());
        }
        for(int j = 0; j <= maxLength; j++) {
            if(s.length() >= j) {
                if (set.contains(s.substring(0, j))) {
                    dp[j-1] = 1;
                }
            }
        }

        for(int i = 0; i <= s.length(); i++) {
            if(dp[i] == 1) {
                for (int j = 0; j <= maxLength; j++) {
                    if((i+j+1) <= s.length()) {
                        if (set.contains(s.substring(i+1, i+1+j))) {
                            dp[i+j] = 1;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[s.length()-1]==1;
    }
}


//Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
//Note that the same word in the dictionary may be reused multiple times in the segmentation.
//
//Example 1:
//Input: s = "leetcode", wordDict = ["leet","code"]
//Output: true
//Explanation: Return true because "leetcode" can be segmented as "leet code".

//Example 2:
//Input: s = "applepenapple", wordDict = ["apple","pen"]
//Output: true
//Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
//Note that you are allowed to reuse a dictionary word.

//Example 3:
//Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
//Output: false

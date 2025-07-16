package org.example.string.re;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] sArr = new int[26];
            for (int j = 0; j < str.length(); j++) {
                sArr[str.charAt(j) - 'a'] += 1;
            }

            if (map.containsKey(Arrays.toString(sArr))) {
                map.get(Arrays.toString(sArr)).add(str);
            } else {
                map.put(Arrays.toString(sArr), new ArrayList<>(List.of(str)));
            }
        }

        return map.values().stream().toList();

    }
}
//
//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//Example 1:
//
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//
//Explanation:
//
//There is no string in strs that can be rearranged to form "bat".
//The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
//The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

//Example 2:
//Input: strs = [""]
//Output: [[""]]
//
//Example 3:
//Input: strs = ["a"]
//Output: [["a"]]
//
//Constraints:
//
//        1 <= strs.length <= 104
//        0 <= strs[i].length <= 100
//strs[i] consists of lowercase English letters.
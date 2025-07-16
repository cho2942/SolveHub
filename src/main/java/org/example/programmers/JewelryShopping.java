package org.example.programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelryShopping {
    public int[] solution(String[] gems) {
        int[] answer = new int[2];
        int length = Integer.MAX_VALUE;
        Map<String, Integer> jewelMap = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (String gem : gems) {
            set.add(gem);
        }

        int jewelSize = set.size();
        int left = 0;
        int right = 0;

        while (right < gems.length) {
            jewelMap.put(gems[right], jewelMap.getOrDefault(gems[right], 0) + 1);
            right++;

            while (jewelSize == jewelMap.size()) {
                if (length > (right - left)) {
                    length = (right - left);
                    answer[0] = left;
                    answer[1] = right-1;
                }

                if (jewelMap.get(gems[left]) > 1)
                    jewelMap.put(gems[left], jewelMap.get(gems[left]) - 1);
                else
                    jewelMap.remove(gems[left]);

                left++;
            }

        }


        return new int[]{answer[0]+1, answer[1]+1};
    }
}


//["AA", "AB", "AC", "AA", "AC"]	[1, 3]
//["XYZ", "XYZ", "XYZ"]	[1, 1]
//["ZZZ", "YYY", "NNNN", "YYY", "BBB"]	[1, 5]
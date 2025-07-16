package org.example.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hm.containsKey(complement)) {
                arr[0] = i;
                arr[1] = hm.get(complement);
                break;
            }
            else{
                hm.put(nums[i],i);
            }
        }

        return arr;
    }
}
/*
 전체 검색 45ms 개느림.. 어떻게 빨리 할수있을까..
 arrays 순서가 바껴서 쓰기 애매함..

  --> hashmap 이 정답 개빠름. n번 돌기위해 hashmap 채워 나가면서 체크함...
 */
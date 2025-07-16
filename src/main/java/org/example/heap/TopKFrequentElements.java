package org.example.heap;

import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue());

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            pq.offer(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }

        for(int i=0; i<k; i++){
            result.add(pq.poll().getKey());
        }
        Collections.reverse(result);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}


//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//
//        Example 1:
//
//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]
//Example 2:
//
//Input: nums = [1], k = 1
//Output: [1]
//
//
//Constraints:
//
//        1 <= nums.length <= 105
//        -104 <= nums[i] <= 104
//k is in the range [1, the number of unique elements in the array].
//It is guaranteed that the answer is unique.
package org.example.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        //Set<Integer> set = new HashSet<>(); this will create overhead of regrowth
        Set<Integer> set = new HashSet<>((int)(nums.length / 0.75f) + 1);
        for(int x : nums){
            if(!set.add(x)){ // if already added
                return true;
            }
        }
        return false;
    }
}

//set으로 했는데 ㄱㅐ느림.... 하위 30%.....
//set contains 50%......
//set add 함수는 boolean값을 return 한다...

//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//
//Explanation:
//
//The element 1 occurs at the indices 0 and 3.
//
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//
//Explanation:
//
//All elements are distinct.
//
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true

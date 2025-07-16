package org.example.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        Map<String, Integer> dupCheck = new HashMap();

        while(head != null) {
            if(dupCheck.containsKey(String.valueOf(head.hashCode()))) {
                return false;
            }else{
                dupCheck.put(String.valueOf(head.hashCode()), 1);
            }
            head = head.next;
        }
        return true;
    }
}

package org.example.linkedlist.re;

import org.example.linkedlist.ListNode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        for(int i = 0; i<n; i++){
            second = second.next;
        }

        while(second.next != null){
            second = second.next;
            first = first.next;
        }

        first.next = first.next.next;

        return dummy.next;
    }
}

//
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
//Example 2:
//
//Input: head = [1], n = 1
//Output: []
//Example 3:
//
//Input: head = [1,2], n = 1
//Output: [1]
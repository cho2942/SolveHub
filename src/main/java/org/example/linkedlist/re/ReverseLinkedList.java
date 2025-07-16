package org.example.linkedlist.re;

import org.example.linkedlist.ListNode;

public class ReverseLinkedList {

        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            while(head != null) {
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }

            return head;
        }
}

package org.example.linkedlist.re;

import org.example.linkedlist.ListNode;

import java.util.PriorityQueue;

public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                (a,b) -> a.val - b.val
        );

        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(!pq.isEmpty()) {
            dummy.next = pq.poll();

            dummy = dummy.next;
            if(dummy.next != null) {
                pq.add(dummy.next);
            }
        }
        return head.next;
    }
}


//Example 1:
//
//Input: lists = [[1,4,5],[1,3,4],[2,6]]
//Output: [1,1,2,3,4,4,5,6]
//Explanation: The linked-lists are:
//        [
//        1->4->5,
//        1->3->4,
//        2->6
//        ]
//merging them into one sorted list:
//        1->1->2->3->4->4->5->6
//Example 2:
//
//Input: lists = []
//Output: []
//Example 3:
//
//Input: lists = [[]]
//Output: []
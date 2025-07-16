package org.example.linkedlist.re;

import org.example.linkedlist.ListNode;

import java.util.ArrayList;

public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        // 1. Find the middle of the linked list using slow and fast pointers
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Split the list into two halves
        ListNode secondHalf = slow.next;
        slow.next = null;  // End the first half of the list

        // 3. Reverse the second half of the list
        secondHalf = reverseList(secondHalf);

        // 4. Merge the two halves
        ListNode firstHalf = head;
        while (secondHalf != null) {
            // Save the next nodes
            ListNode tmp1 = firstHalf.next;
            ListNode tmp2 = secondHalf.next;

            // Reorder the nodes
            firstHalf.next = secondHalf;
            secondHalf.next = tmp1;

            // Move to the next nodes
            firstHalf = tmp1;
            secondHalf = tmp2;
        }
    }

    // Helper function to reverse the linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}


//
//Input: head = [1,2,3,4]
//Output: [1,4,2,3]

//
//Input: head = [1,2,3,4,5]
//Output: [1,5,2,4,3]
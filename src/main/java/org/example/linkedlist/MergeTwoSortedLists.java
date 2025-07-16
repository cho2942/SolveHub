package org.example.linkedlist;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(0);
        ListNode curr = head;

        while(list1 != null && list2 != null) {

            if(list1.val <= list2.val) {
                 head.next = list1;
                 list1 = list1.next;
            }else{
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }

        if(list1 != null) {
            head.next = list1;
        }
        if(list2 != null) {
            head.next = list2;
        }

        return curr.next;
    }
}


//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]

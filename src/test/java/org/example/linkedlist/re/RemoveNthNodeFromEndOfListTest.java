package org.example.linkedlist.re;

import org.assertj.core.api.Assertions;
import org.example.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {

    RemoveNthNodeFromEndOfList re = new RemoveNthNodeFromEndOfList();

    @Test
    void removeNthFromEnd() {

        Assertions.assertThat(re.removeNthFromEnd(new ListNode(1), 1)).isEqualTo(null);
    }
}
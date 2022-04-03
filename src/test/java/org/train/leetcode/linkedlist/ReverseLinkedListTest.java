package org.train.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.train.leetcode.linkedlist.ReverseLinkedList.reverseList;
import static org.train.leetcode.linkedlist.Utils.getListNodes;

class ReverseLinkedListTest {

    @Test
    void reverseListTest() {
        ListNode listNodes = getListNodes();
        ListNode current = reverseList(listNodes);
        for (int i = 5; i > 0; i--) {
            assertEquals(i, current.val);
            current = current.next;
        }
    }

}
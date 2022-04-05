package org.train.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.linkedlist.$0092ReverseLinkedListBetween.reverseBetween;
import static org.train.leetcode.linkedlist.$0206ReverseLinkedList.reverseList;
import static org.train.leetcode.linkedlist.Utils.getListNodes;

class $0092ReverseLinkedListBetweenTest {

    @Test
    void reverseBetweenTest() {
        ListNode node = reverseBetween(getListNodes(), 2, 4);
        assertEquals(1, node.val);
        node = node.next;
        assertEquals(4, node.val);
        node = node.next;
        assertEquals(3, node.val);
        node = node.next;
        assertEquals(2, node.val);
        node = node.next;
        assertEquals(5, node.val);
    }
}
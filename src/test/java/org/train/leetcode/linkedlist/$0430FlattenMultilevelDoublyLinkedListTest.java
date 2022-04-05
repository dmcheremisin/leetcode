package org.train.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.linkedlist.$0430FlattenMultilevelDoublyLinkedList.flatten;
import static org.train.leetcode.linkedlist.Utils.getMultiLevelNodes;

class $0430FlattenMultilevelDoublyLinkedListTest {

    @Test
    void flattenTest() {
        Node node = flatten(getMultiLevelNodes());
        assertEquals(1, node.val);
        node = node.next;
        assertEquals(2, node.val);
        node = node.next;
        assertEquals(3, node.val);
        node = node.next;
        assertEquals(7, node.val);
        node = node.next;
        assertEquals(8, node.val);
        node = node.next;
        assertEquals(11, node.val);
        node = node.next;
        assertEquals(12, node.val);
        node = node.next;
        assertEquals(9, node.val);
        node = node.next;
        assertEquals(10, node.val);
        node = node.next;
        assertEquals(4, node.val);
        node = node.next;
        assertEquals(5, node.val);
        node = node.next;
        assertEquals(6, node.val);
    }
}
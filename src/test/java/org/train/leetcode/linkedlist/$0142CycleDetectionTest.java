package org.train.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.linkedlist.$0142CycleDetection.detectCycle;
import static org.train.leetcode.linkedlist.Utils.getListNodesWithCycle;

class $0142CycleDetectionTest {

    @Test
    void detectCycleTest() {
        ListNode listNode = detectCycle(getListNodesWithCycle());
        assertEquals(3, listNode.val);
    }
}
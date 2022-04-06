package org.train.leetcode.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $0232ImplementQueueUsingStacksTest {

    @Test
    public void testQueue1() {
        var queue = new $0232ImplementQueueUsingStacks();
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.peek());
        assertEquals(1, queue.pop());
        assertFalse(queue.empty());
        assertEquals(2, queue.pop());
        assertTrue(queue.empty());
    }

    @Test
    public void testQueue2() {
        var queue = new $0232ImplementQueueUsingStacks();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        assertEquals(1, queue.pop());

        queue.push(4);
        assertEquals(2, queue.peek());
        assertEquals(2, queue.pop());
        assertEquals(3, queue.pop());

        queue.push(5);
        assertEquals(4, queue.pop());
        assertEquals(5, queue.pop());
    }

}
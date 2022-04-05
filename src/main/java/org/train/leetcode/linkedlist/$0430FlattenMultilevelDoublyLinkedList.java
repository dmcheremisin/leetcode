package org.train.leetcode.linkedlist;

// You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer,
// and an additional child pointer.
// This child pointer may or may not point to a separate doubly linked list, also containing these special nodes.
// These child lists may have one or more children of their own, and so on, to produce a multilevel data structure as shown in the example below.
// Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level,
// doubly linked list. Let curr be a node with a child list.
// The nodes in the child list should appear after curr and before curr.next in the flattened list.
// Return the head of the flattened list. The nodes in the list must have all of their child pointers set to null.
// Input: head =
//1---2---3---4---5---6--NULL
//        |
//        7---8---9---10--NULL
//            |
//           11--12--NULL
// Output: [1,2,3,7,8,11,12,9,10,4,5,6]

public class $0430FlattenMultilevelDoublyLinkedList {

    public static Node flatten(Node head) {
        var current = head;

        while (current != null) {

            if (current.child != null) {
                var next = current.next;

                var last = current.child;
                while (last.next != null)
                    last = last.next;

                current.next = current.child;
                current.child.prev = current;

                if (next != null) {
                    last.next = next;
                    next.prev = last;
                }

                current.child = null;
            }

            current = current.next;
        }

        return head;
    }
}
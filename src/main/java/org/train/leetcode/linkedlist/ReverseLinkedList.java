package org.train.leetcode.linkedlist;

//Given the head of a singly linked list, reverse the list, and return the reversed list.
//Input: head = [1,2,3,4,5]
//Output: [5,4,3,2,1]

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
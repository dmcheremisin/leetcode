package org.train.leetcode.linkedlist;

public class Utils {

    public static ListNode getListNodes() {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 5; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        return head;
    }

}

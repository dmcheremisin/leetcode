package org.train.leetcode.linkedlist;

//Given the head of a singly linked list and two integers left and right where left <= right,
//reverse the nodes of the list from position left to position right, and return the reversed list.
//Input: head = [1,2,3,4,5], left = 2, right = 4
//Output: [1,4,3,2,5]

class $0092ReverseLinkedListBetween {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        int currentPos = 1;
        ListNode currentNode = head, start = head;

        while(currentPos < left) {
            start = currentNode;
            currentNode = currentNode.next;
            currentPos++;
        }

        ListNode newList = null, tail = currentNode;
        while(left <= currentPos && currentPos <= right) {
            ListNode next = currentNode.next;
            currentNode.next = newList;
            newList = currentNode;
            currentNode = next;
            currentPos++;
        }

        start.next = newList;
        tail.next = currentNode;

        if(left > 1)
            return head;
        else
            return newList;
    }
}
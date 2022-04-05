package org.train.leetcode.linkedlist;

public class Utils {

    public static ListNode getListNodes() {
        return new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)
                                )
                        )
                )
        );
    }

    public static ListNode getListNodesWithCycle() {
        ListNode five = new ListNode(5);
        ListNode three = new ListNode(3,
                new ListNode(4, five)
        );
        five.next = three;
        return new ListNode(1,
                new ListNode(2, three)
        );
    }

    public static Node getMultiLevelNodes() {
        //1---2---3---4---5---6--NULL
        //        |
        //        7---8---9---10--NULL
        //            |
        //           11--12--NULL
        Node eleven = new Node(11,
                new Node(12)
        );
        Node seven = new Node(7,
                new Node(8,
                        new Node(9,
                                new Node(10)
                        ),
                        eleven
                )
        );
        return new Node(1,
                new Node(2,
                        new Node(3,
                                new Node(4,
                                        new Node(5,
                                                new Node(6)
                                        )
                                ),
                                seven
                        )
                )
        );
    }
}

package org.train.leetcode.binaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $0222CountCompleteTreeNodesTest {

    private $0222CountCompleteTreeNodes count = new $0222CountCompleteTreeNodes();

    @Test
    void countNodesTest() {
        TreeNode left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        TreeNode right = new TreeNode(3, new TreeNode(6), null);
        TreeNode root = new TreeNode(1, left, right);

        assertEquals(6, count.countNodes(root));
    }
}
package org.train.leetcode.binaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $0104MaximumDepthOfBinaryTreeTest {

    private $0104MaximumDepthOfBinaryTree max = new $0104MaximumDepthOfBinaryTree();

    @Test
    void maxDepthTest() {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3, new TreeNode(4), new TreeNode(5));
        TreeNode root = new TreeNode(1, left, right);

        assertEquals(3, max.maxDepth(root));
    }
}
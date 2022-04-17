package org.train.leetcode.binaryTree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class $0102LevelOrderTraversalTest {

    private $0102LevelOrderTraversal traversal = new $0102LevelOrderTraversal();

    @Test
    void levelOrderTest() {
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, left, right);

        List<List<Integer>> expected = List.of(List.of(3), List.of(9, 20), List.of(15, 7));
        assertEquals(expected, traversal.levelOrder(root));
    }
}
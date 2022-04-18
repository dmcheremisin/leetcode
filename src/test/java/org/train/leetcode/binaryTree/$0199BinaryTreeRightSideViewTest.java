package org.train.leetcode.binaryTree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class $0199BinaryTreeRightSideViewTest {

    private $0199BinaryTreeRightSideView view = new $0199BinaryTreeRightSideView();

    @Test
    void rightSideViewTest() {
        TreeNode left = new TreeNode(2, null, new TreeNode(5));
        TreeNode right = new TreeNode(3 );
        TreeNode root = new TreeNode(1, left, right);

        assertEquals(List.of(1, 3, 5), view.rightSideView(root));
    }
}
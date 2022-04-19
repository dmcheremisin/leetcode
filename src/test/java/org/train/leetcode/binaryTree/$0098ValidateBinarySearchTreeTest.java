package org.train.leetcode.binaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $0098ValidateBinarySearchTreeTest {

    private $0098ValidateBinarySearchTree getValidator() {
        return new $0098ValidateBinarySearchTree();
    }

    @Test
    void isValidBSTTest1() {
        assertTrue(getValidator().isValidBST(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
    }

    @Test
    void isValidBSTTest2() {
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4, new TreeNode(3), new TreeNode(6));
        TreeNode root = new TreeNode(5, left, right);

        assertFalse(getValidator().isValidBST(root));
    }

    @Test
    void isValidBSTTest3() {
        TreeNode left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode right = new TreeNode(6, new TreeNode(5), new TreeNode(7));
        TreeNode root = new TreeNode(4, left, right);

        assertTrue(getValidator().isValidBST(root));
    }

    @Test
    void isValidBSTTest4() {
        TreeNode left = new TreeNode(2, new TreeNode(1), new TreeNode(9));
        TreeNode right = new TreeNode(6, new TreeNode(5), new TreeNode(7));
        TreeNode root = new TreeNode(4, left, right);

        assertFalse(getValidator().isValidBST(root));
    }

    @Test
    void isValidBSTTest5() {
        assertFalse(getValidator().isValidBST(new TreeNode(2, new TreeNode(2), new TreeNode(2))));
    }

    @Test
    void isValidBSTTest6() {
        assertTrue(getValidator().isValidBST(new TreeNode(2147483647)));
    }
}
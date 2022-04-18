package org.train.leetcode.binaryTree;

//Given the root of a complete binary tree, return the number of the nodes in the tree.
//According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree,
//and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
//Design an algorithm that runs in less than O(n) time complexity.
//Input: root = [1,2,3,4,5,6]
//Output: 6

public class $0222CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int height = 1;
        TreeNode left = root.left, right = root.right;
        while (left != null && right != null) {
            height++;
            left = left.left;
            right = right.right;
        }

        if (left == null && right == null) return (int) Math.pow(2, height) - 1;

        return countNodes(root.left) + countNodes(root.right) + 1;
    }

}
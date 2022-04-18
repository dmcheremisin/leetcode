package org.train.leetcode.binaryTree;

import java.util.ArrayList;
import java.util.List;

//Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes
//you can see ordered from top to bottom.
//Input: root = [1,2,3,null,5,null,null]
//Output: [1,3,5]

public class $0199BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list, 0);
        return list;
    }

    private void traverse(TreeNode node, List<Integer> list, int level) {
        if(node == null) return;

        if (list.size() <= level)
            list.add(node.val);

        traverse(node.left, list, level + 1);
        traverse(node.right, list, level + 1);
    }
}
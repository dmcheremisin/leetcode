package org.train.leetcode.binaryTree;

import java.util.ArrayList;
import java.util.List;

//Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
//Input: root = [3,9,20,null,null,15,7]
//Output: [[3],[9,20],[15,7]]

public class $0102LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        traverse(list, root, 0);
        return list;
    }

    private void traverse(List<List<Integer>> list, TreeNode node, int level) {
        if (node == null)
            return;

        if (list.size() <= level)
            list.add(new ArrayList<>());

        list.get(level).add(node.val);

        traverse(list, node.left, level + 1);
        traverse(list, node.right, level + 1);
    }
}
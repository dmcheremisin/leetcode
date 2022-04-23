package org.train.leetcode.arrays;

import java.util.LinkedList;
import java.util.Queue;

//You are given an m x n grid where each cell can have one of three values:
//0 representing an empty cell,
//1 representing a fresh orange, or
//2 representing a rotten orange.
//Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
//Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
//Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
//Output: 4

public class $0994RottingOranges {

    public int orangesRotting(int[][] grid) {
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int rows = grid.length;
        int cols = grid[0].length;

        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) fresh++;
                else if (grid[i][j] == 2) queue.add(new int[]{i, j});
            }
        }

        int minutes = 0;
        int queueSize = queue.size();
        while (!queue.isEmpty()) {
            if (queueSize == 0) {
                minutes++;
                queueSize = queue.size();
            }

            int[] orange = queue.poll();
            queueSize--;
            for (int[] dir : dirs) {
                int dRow = orange[0] + dir[0];
                int dCol = orange[1] + dir[1];
                if (dRow >= 0 && dRow < rows && dCol >= 0 && dCol < cols && grid[dRow][dCol] == 1) {
                    queue.add(new int[]{dRow, dCol});
                    grid[dRow][dCol] = 2;
                    fresh--;
                }
            }
        }

        return fresh == 0 ? minutes : -1;
    }
}
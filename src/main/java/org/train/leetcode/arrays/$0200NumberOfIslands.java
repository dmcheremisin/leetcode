package org.train.leetcode.arrays;

import java.util.concurrent.atomic.AtomicInteger;

//Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
//An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
//You may assume all four edges of the grid are all surrounded by water.
//Example 1:
//Input: grid = [
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]
//Output: 1

public class $0200NumberOfIslands {

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] directions = new int[][]{new int[]{-1, 0}, new int[]{1, 0}, new int[]{0, -1}, new int[]{0, 1}};
        int num = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    num++;
                    traverse(i, j, directions, grid, rows, cols);
                }
            }
        }
        return num;
    }

    private void traverse(int row, int col, int[][] directions, char[][] grid, int rows, int cols) {
        grid[row][col] = '0';
        for (int[] dir : directions) {
            int dRow = row + dir[0];
            int dCol = col + dir[1];
            if (dRow >= 0 && dRow < rows && dCol >= 0 && dCol < cols && grid[dRow][dCol] == '1')
                traverse(dRow, dCol, directions, grid, rows, cols);
        }
    }
}
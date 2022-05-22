package org.train.leetcode.arrays;

//You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.)
//You may assume all four edges of the grid are surrounded by water.
//The area of an island is the number of cells with a value 1 in the island.
//Return the maximum area of an island in grid. If there is no island, return 0.
//Example 1:
//Input: grid = [
// [0,0,1,0,0,0,0,1,0,0,0,0,0],
// [0,0,0,0,0,0,0,1,1,1,0,0,0],
// [0,1,1,0,1,0,0,0,0,0,0,0,0],
// [0,1,0,0,1,1,0,0,1,0,1,0,0],
// [0,1,0,0,1,1,0,0,1,1,1,0,0],
// [0,0,0,0,0,0,0,0,0,0,1,0,0],
// [0,0,0,0,0,0,0,1,1,1,0,0,0],
// [0,0,0,0,0,0,0,1,1,0,0,0,0]
//]
//Output: 6
//Explanation: The answer is not 11, because the island must be connected 4-directionally.
//Example 2:
//Input: grid = [[0,0,0,0,0,0,0,0]]
//Output: 0

public class $0695MaxAreaOfIslandDFS {

    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int rows;
    int cols;

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        this.rows = grid.length;
        this.cols = grid[0].length;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (grid[i][j] == 1)
                    max = Math.max(max, dfs(grid, i, j, 0));

        return max;
    }

    private int dfs(int[][] grid, int row, int col, int counter) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == 0)
            return 0;

        counter++;
        grid[row][col] = 0;

        for (int[] dir : directions)
            counter += dfs(grid, row + dir[0], col + dir[1], 0);

        return counter;
    }
}
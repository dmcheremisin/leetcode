package org.train.leetcode.dynamicProgramming;

//On an n x n chessboard, a knight starts at the cell (row, column) and attempts to make exactly k moves.
//The rows and columns are 0-indexed, so the top-left cell is (0, 0), and the bottom-right cell is (n - 1, n - 1).
//A chess knight has eight possible moves it can make, as illustrated below.
//Each move is two cells in a cardinal direction, then one cell in an orthogonal direction.
//Each time the knight is to move, it chooses one of eight possible moves uniformly at random
//(even if the piece would go off the chessboard) and moves there.
//The knight continues moving until it has made exactly k moves or has moved off the chessboard.
//Return the probability that the knight remains on the board after it has stopped moving.
//Input: n = 3, k = 2, row = 0, column = 0
//Output: 0.06250
//Explanation: There are two moves (to (1,2), (2,1)) that will keep the knight on the board.
//From each of those positions, there are also two moves that will keep the knight on the board.
//The total probability the knight stays on the board is 0.0625.

class $0688KnightProbabilityInChessboard {

    private static final int[][] dirs = new int[][]{
            new int[]{-2, -1}, new int[]{-2, 1}, new int[]{-1, -2}, new int[]{-1, 2},
            new int[]{2, -1}, new int[]{2, 1}, new int[]{1, -2}, new int[]{1, 2},
    };

    public double knightProbability(int n, int k, int row, int column) {
        return calcProbability(n, k, row, column, new Double[k][n][n]);
    }

    private double calcProbability(int n, int k, int row, int column, Double[][][] dp) {
        if (row < 0 || row >= n || column < 0 || column >= n)
            return 0;

        if (k == 0)
            return 1;

        if (dp[k - 1][row][column] != null)
            return dp[k - 1][row][column];

        double res = 0;
        for (int[] dir : dirs)
            res += calcProbability(n, k - 1, row + dir[0], column + dir[1], dp) / 8;

        return dp[k - 1][row][column] = res;
    }
}
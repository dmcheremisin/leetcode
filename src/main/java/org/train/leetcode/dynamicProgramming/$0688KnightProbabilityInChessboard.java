package org.train.leetcode.dynamicProgramming;

class $0688KnightProbabilityInChessboard {

    private static final int[][] dirs = new int[][]{
            new int[]{-2, -1}, new int[]{-2, 1}, new int[]{-1, -2}, new int[]{-1, 2},
            new int[]{2, -1}, new int[]{2, 1}, new int[]{1, -2}, new int[]{1, 2},
    };

    public double knightProbability(int n, int k, int row, int column) {
        Double[][][] dp = new Double[k][n][n];
        return calcProbability(n, k, row, column, dp);
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

        dp[k - 1][row][column] = res;

        return res;
    }
}
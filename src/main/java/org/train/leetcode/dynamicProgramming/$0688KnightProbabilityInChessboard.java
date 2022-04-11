package org.train.leetcode.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

class $0688KnightProbabilityInChessboard {

    private static final int[][] dirs = new int[][]{
            new int[]{-2, -1}, new int[]{-2, 1}, new int[]{-1, -2}, new int[]{-1, 2},
            new int[]{ 2, -1}, new int[]{ 2, 1}, new int[]{ 1, -2}, new int[]{1, 2},
    };

    private Map<Integer, Map<Integer, Double[]>> dp = new HashMap<>();

    public double knightProbability(int n, int k, int row, int column) {
        return calcProbability(n, k, row, column, dp);
    }

    private double calcProbability(int n, int k, int row, int column,
                                   Map<Integer, Map<Integer, Double[]>> dp) {
        if (row < 0 || row >= n || column < 0 || column >= n)
            return 0;

        if (k == 0)
            return 1;

        Map<Integer, Double[]> dpk = dp.get(k);
        if (dpk != null && dpk.get(row) != null && dpk.get(row)[column] != null)
            return dpk.get(row)[column];

        double res = 0;
        for (int[] dir : dirs)
            res += (knightProbability(n, k - 1, row + dir[0], column + dir[1]) / 8);

        dpk = dp.computeIfAbsent(k, key -> new HashMap<>());
        Double[] columns = dpk.computeIfAbsent(row, key -> new Double[n]);
        columns[column] = res;

        return res;
    }
}
package org.train.leetcode.dynamicProgramming;

import java.util.Arrays;

//You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
//Once you pay the cost, you can either climb one or two steps.
//You can either start from the step with index 0, or the step with index 1.
//Return the minimum cost to reach the top of the floor.
//Input: cost = [10,15,20]
//Output: 15
//Explanation: You will start at index 1. Pay 15 and climb two steps to reach the top.
//The total cost is 15.

public class $0746MinCostClimbingStairs {

    public int minCostClimbingStairsRecursive(int[] cost) {
        int n = cost.length;
        if (n <= 1) {
            return 0;
        }
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(minCost(cost, n - 1, dp), minCost(cost, n - 2, dp));
    }

    private int minCost(int[] cost, int i, int[] dp) {
        if (i < 0) return 0;
        if (dp[i] != -1) return dp[i];

        dp[i] = cost[i] + Math.min(minCost(cost, i - 1, dp), minCost(cost, i - 2, dp));
        return dp[i];
    }

    public int minCostClimbingStairsIterative(int[] cost) {
        int n = cost.length;
        int first = 0, second = 0, current;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                first = cost[i];
            } else if(i == 1) {
                second = cost[i];
            } else {
                current = cost[i] + Math.min(first, second);
                first = second;
                second = current;
            }
        }
        return Math.min(first, second);
    }
}
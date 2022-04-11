package org.train.leetcode.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class $0746MinCostClimbingStairsTest {

    private $0746MinCostClimbingStairs stairs = new $0746MinCostClimbingStairs();

    @Test
    void minCostClimbingStairsRecursiveTest1() {
        assertEquals(15, stairs.minCostClimbingStairsRecursive(new int[]{10, 15, 20}));
    }

    @Test
    void minCostClimbingStairsRecursiveTest2() {
        assertEquals(6, stairs.minCostClimbingStairsRecursive(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    @Test
    void minCostClimbingStairsIterativeTest1() {
        assertEquals(15, stairs.minCostClimbingStairsIterative(new int[]{10, 15, 20}));
    }

    @Test
    void minCostClimbingStairsIterativeTest2() {
        assertEquals(6, stairs.minCostClimbingStairsIterative(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
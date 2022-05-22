package org.train.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class $0695MaxAreaOfIslandTest {

    @Test
    void maxAreaOfIslandTest1() {
        $0695MaxAreaOfIsland area = new $0695MaxAreaOfIsland();
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        assertEquals(6, area.maxAreaOfIsland(grid));
    }

    @Test
    void maxAreaOfIslandTest2() {
        $0695MaxAreaOfIsland area = new $0695MaxAreaOfIsland();
        assertEquals(1, area.maxAreaOfIsland(new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},}));
    }

    @Test
    void maxAreaOfIslandTest3() {
        $0695MaxAreaOfIsland area = new $0695MaxAreaOfIsland();
        assertEquals(0, area.maxAreaOfIsland(new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0},}));
    }
}
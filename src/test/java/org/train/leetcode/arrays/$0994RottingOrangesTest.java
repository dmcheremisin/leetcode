package org.train.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $0994RottingOrangesTest {

    private $0994RottingOranges oranges = new $0994RottingOranges();

    @Test
    void orangesRottingTest1() {
        assertEquals(4, oranges.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
    }

    @Test
    void orangesRottingTest2() {
        assertEquals(0, oranges.orangesRotting(new int[][]{{}}));
    }

    @Test
    void orangesRottingTest3() {
        assertEquals(-1, oranges.orangesRotting(new int[][]{{1}}));
    }

    @Test
    void orangesRottingTest4() {
        assertEquals(-1, oranges.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
    }
}
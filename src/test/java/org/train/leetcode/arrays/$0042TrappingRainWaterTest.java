package org.train.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.arrays.$0042TrappingRainWater.trap;

class $0042TrappingRainWaterTest {

    @Test
    void trapTest1() {
        assertEquals(6, trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    void trapTest2() {
        assertEquals(9, trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}
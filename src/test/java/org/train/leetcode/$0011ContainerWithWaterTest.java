package org.train.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $0011ContainerWithWaterTest {

    private static final $0011ContainerWithWater container = new $0011ContainerWithWater();

    @Test
    void maxArea() {
        int area = container.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(49, area);
    }
}
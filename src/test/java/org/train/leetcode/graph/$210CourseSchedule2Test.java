package org.train.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class $210CourseSchedule2Test {

    private static final $210CourseSchedule2 schedule = new $210CourseSchedule2();

    @Test
    void findOrderTest() {
        int[][] p = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] order = schedule.findOrder(4, p);
        int[] expected = {0, 2, 1, 3};
        assertArrayEquals(expected, order);
    }
}
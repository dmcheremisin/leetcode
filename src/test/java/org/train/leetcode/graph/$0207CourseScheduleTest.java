package org.train.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.train.leetcode.graph.$0207CourseSchedule.canFinish;

class $0207CourseScheduleTest {

    @Test
    void canFinishTest1() {
        assertTrue(canFinish(2,
                new int[][]{
                        new int[]{1, 0}
                }));
    }

    @Test
    void canFinishTest2() {
        assertTrue(canFinish(2,
                new int[][]{
                        new int[]{0, 1}
                }));
    }

    @Test
    void canFinishTest3() {
        assertFalse(canFinish(2,
                new int[][]{
                        new int[]{1, 0},
                        new int[]{0, 1}
                }));
    }

    @Test
    void canFinishTest4() {
        assertTrue(canFinish(6,
                new int[][]{
                        new int[]{1, 0},
                        new int[]{2, 1},
                        new int[]{2, 5},
                        new int[]{0, 3},
                        new int[]{4, 3},
                        new int[]{3, 5},
                        new int[]{4, 5},
                }));
    }
}
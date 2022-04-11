package org.train.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class $0743NetworkDelayTimeBellmanFordTest {

    private $0743NetworkDelayTimeBellmanFord delayTime = new $0743NetworkDelayTimeBellmanFord();

    @Test
    void networkDelayTimeTest1() {
        int[][] times = new int[][]{new int[]{2, 1, 1}, new int[]{2, 3, 1}, new int[]{3, 4, 1}};
        assertEquals(2, this.delayTime.networkDelayTime(times, 4, 2));
    }

    @Test
    void networkDelayTimeTest2() {
        int[][] times = new int[][]{new int[]{1, 2, 1}};
        assertEquals(1, this.delayTime.networkDelayTime(times, 2, 1));
    }

    @Test
    void networkDelayTimeTest3() {
        int[][] times = new int[][]{new int[]{1, 2, 1}};
        assertEquals(-1, this.delayTime.networkDelayTime(times, 2, 2));
    }

    @Test
    void networkDelayTimeTest4() {
        int[][] times = new int[][]{new int[]{1, 2, 9}, new int[]{1, 4, 2}, new int[]{2, 5, 1}, new int[]{4, 2, 4},
                new int[]{4, 5, 6}, new int[]{3, 2, 3}, new int[]{5, 3, 7}, new int[]{3, 1, 5}};
        assertEquals(14, this.delayTime.networkDelayTime(times, 5, 1));
    }
}
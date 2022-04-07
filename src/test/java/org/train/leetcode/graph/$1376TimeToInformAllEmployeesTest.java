package org.train.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.graph.$1376TimeToInformAllEmployees.numOfMinutes;

class $1376TimeToInformAllEmployeesTest {

    @Test
    public void test1() {
        assertEquals(1, numOfMinutes(6, 2, new int[]{2, 2, -1, 2, 2, 2}, new int[]{0, 0, 1, 0, 0, 0}));
    }

    @Test
    public void test2() {
        assertEquals(13, numOfMinutes(8, 4, new int[]{2, 2, 4, 6, -1, 4, 4, 5}, new int[]{0, 0, 4, 0, 7, 3, 6, 0}));
    }

}
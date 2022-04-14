package org.train.leetcode.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $0034FindFirstAndLastPositionOfElementTest {

    private $0034FindFirstAndLastPositionOfElement find = new $0034FindFirstAndLastPositionOfElement();

    @Test
    void searchRangeTest1() {
        int[] result = find.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        assertArrayEquals(new int[]{3, 4}, result);
    }

    @Test
    void searchRangeTest2() {
        int[] result = find.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void searchRangeTest3() {
        int[] result = find.searchRange(new int[]{1, 4}, 4);
        assertArrayEquals(new int[]{1, 1}, result);
    }

    @Test
    void searchRangeTest4() {
        int[] result = find.searchRange(new int[]{1, 4}, 1);
        assertArrayEquals(new int[]{0, 0}, result);
    }

    @Test
    void searchRangeTest5() {
        int[] result = find.searchRange(new int[]{1, 4}, 7);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void searchRangeTest6() {
        int[] result = find.searchRange(new int[]{}, 1);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void searchRangeTest7() {
        int[] result = find.searchRange(new int[]{1}, 1);
        assertArrayEquals(new int[]{0, 0}, result);
    }

    @Test
    void searchRangeTest8() {
        int[] result = find.searchRange(new int[]{1}, 5);
        assertArrayEquals(new int[]{-1, -1}, result);
    }
}
package org.train.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $0200NumberOfIslandsTest {

    private $0200NumberOfIslands num = new $0200NumberOfIslands();

    @Test
    void numIslandsTest1() {
        char[][] grid = new char[][]{
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'0', '0', '1', '0', '0'},
                new char[]{'0', '0', '0', '1', '1'}
        };
        assertEquals(3, num.numIslands(grid));
    }

    @Test
    void numIslandsTest2() {
        char[][] grid = new char[][]{
                new char[]{'1', '1', '1', '1', '0'},
                new char[]{'1', '1', '0', '1', '0'},
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'0', '0', '0', '0', '0'}
        };
        assertEquals(1, num.numIslands(grid));
    }
}
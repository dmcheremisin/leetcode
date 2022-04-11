package org.train.leetcode.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $0688KnightProbabilityInChessboardTest {

    private $0688KnightProbabilityInChessboard solution = new $0688KnightProbabilityInChessboard();

    @Test
    void knightProbabilityTest1() {
        assertEquals(0.0625, solution.knightProbability(3, 2, 0, 0));
    }

    @Test
    void knightProbabilityTest2() {
        assertEquals(0.015625, solution.knightProbability(3, 3, 0, 0));
    }
}
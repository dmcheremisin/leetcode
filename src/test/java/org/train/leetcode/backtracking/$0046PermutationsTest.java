package org.train.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class $0046PermutationsTest {

    private $0046Permutations permutations = new $0046Permutations();

    @Test
    void permuteTest() {
        List<List<Integer>> expectedPermut = new ArrayList<>();
        expectedPermut.add(Arrays.asList(1, 2, 3));
        expectedPermut.add(Arrays.asList(1, 3, 2));
        expectedPermut.add(Arrays.asList(2, 1, 3));
        expectedPermut.add(Arrays.asList(2, 3, 1));
        expectedPermut.add(Arrays.asList(3, 1, 2));
        expectedPermut.add(Arrays.asList(3, 2, 1));

        List<List<Integer>> permute = permutations.permute(new int[]{1, 2, 3});

        assertEquals(expectedPermut, permute);
    }
}
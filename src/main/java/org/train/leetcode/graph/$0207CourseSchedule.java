package org.train.leetcode.graph;

import java.util.*;
import java.util.stream.IntStream;

//There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
//You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first
//if you want to take course ai.
//For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
//Return true if you can finish all courses. Otherwise, return false.
//
//Input: numCourses = 2, prerequisites = [[1,0]]
//Output: true
//Explanation: There are a total of 2 courses to take.
//To take course 1 you should have finished course 0. So it is possible.
//
//Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
//Output: false
//Explanation: There are a total of 2 courses to take.
//To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.

public class $0207CourseSchedule {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];

        Map<Integer, List<Integer>> adjList = new HashMap<>();
        IntStream.range(0, numCourses).forEach(i -> adjList.put(i, new ArrayList<>()));
        for (int[] p : prerequisites) {
            inDegree[p[0]]++;
            adjList.get(p[1]).add(p[0]);
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0)
                stack.push(i);
        }

        int count = 0;
        while (!stack.isEmpty()) {
            int current = stack.pop();
            count++;
            List<Integer> adjacent = adjList.get(current);
            for (int next : adjacent) {
                inDegree[next]--;
                if (inDegree[next] == 0)
                    stack.push(next);
            }
        }

        return count == numCourses;
    }
}
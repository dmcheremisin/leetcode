package org.train.leetcode.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

//There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
//You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
//
//For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
//Return the ordering of courses you should take to finish all courses.
//If there are many valid answers, return any of them. If it is impossible to finish all courses, return an empty array.
//Example
//Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
//Output: [0,2,1,3]
//Explanation: There are a total of 4 courses to take.
//To take course 3 you should have finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
//So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3].


public class $210CourseSchedule2 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if(numCourses == 0) return new int[]{0};

        List<Integer>[] graph = (ArrayList<Integer>[]) new ArrayList[numCourses];
        int[] inDegree = new int[numCourses];
        for(int[] p : prerequisites) {
            int main = p[1];
            int dependant = p[0];

            inDegree[dependant]++;
            if (graph[main] == null)
                graph[main] = new ArrayList<>();
            graph[main].add(dependant);
        }

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++)
            if (inDegree[i] == 0)
                stack.push(i);

        int index = 0;
        int[] result = new int[numCourses];
        while (!stack.isEmpty()) {
            int node = stack.pop();
            result[index++] = node;

            if (graph[node] != null) {
                for (int n : graph[node]) {
                    inDegree[n]--;
                    if (inDegree[n] == 0)
                        stack.push(n);
                }
            }
        }

        return index == numCourses ? result : new int[]{};
    }

}
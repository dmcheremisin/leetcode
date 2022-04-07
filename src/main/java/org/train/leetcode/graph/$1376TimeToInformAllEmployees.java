package org.train.leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//A company has n employees with a unique ID for each employee from 0 to n - 1. The head of the company is the one with headID.
//Each employee has one direct manager given in the manager array where manager[i] is the direct manager of the i-th employee,
//manager[headID] = -1. Also, it is guaranteed that the subordination relationships have a tree structure.
//The head of the company wants to inform all the company employees of an urgent piece of news.
//He will inform his direct subordinates, and they will inform their subordinates, and so on until all employees know about the urgent news.
//The i-th employee needs informTime[i] minutes to inform all of his direct subordinates
//(i.e., After informTime[i] minutes, all his direct subordinates can start spreading the news).
//Return the number of minutes needed to inform all the employees about the urgent news.
//Input: n = 8, headID = 4, manager = [2, 2, 4, 6, -1, 4, 4, 5], informTime = [0, 0, 4, 0, 7, 3, 6, 0]
// 0: []
// 1: []
// 2: [0, 1] => subordinates 0 & 1
// 3: []
// 4: [2, 5, 6] => subordinates 2, 5, 6
// 5: [7] => subordinate 7
// 6: [3] => subordinate 3
// 7: []
//Output: 13
//Explanation: The head of the company with id = 2 is the direct manager of all the employees in the company and needs 1 minute to inform them all.
//The tree structure of the employees in the company is shown.

class $1376TimeToInformAllEmployees {

    public static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int managerId = manager[i];
            if (managerId != -1) {
                adjList.putIfAbsent(managerId, new ArrayList<>());
                adjList.get(managerId).add(i);
            }
        }

        return dfs(headID, adjList, informTime);
    }

    private static int dfs(int managerId, Map<Integer, List<Integer>> adjList, int[] informTime) {
        List<Integer> subordinates = adjList.get(managerId);
        if (subordinates == null || subordinates.isEmpty())
            return 0;

        int max = 0;
        for (int subordinateId : subordinates)
            max = Math.max(max, dfs(subordinateId, adjList, informTime));

        return max + informTime[managerId];
    }
}
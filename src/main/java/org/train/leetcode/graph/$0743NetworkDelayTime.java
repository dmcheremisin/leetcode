package org.train.leetcode.graph;

import java.util.*;
import java.util.stream.IntStream;

//You are given a network of n nodes, labeled from 1 to n.
//You are also given times, a list of travel times as directed edges times[i] = (ui, vi, wi),
//where ui is the source node, vi is the target node, and wi is the time it takes for a signal to travel from source to target.
//
//We will send a signal from a given node k. Return the time it takes for all the n nodes to receive the signal.
//If it is impossible for all the n nodes to receive the signal, return -1.
//Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
//Output: 2

public class $0743NetworkDelayTime {

    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<Integer[]>> adjList = new HashMap<>();
        int[] distances = new int[n];
        IntStream.range(0, n).forEach(i -> {
            adjList.put(i, new ArrayList<>());
            distances[i] = Integer.MAX_VALUE;
        });
        for (int[] time : times)
            adjList.get(time[0] - 1).add(new Integer[]{time[1] - 1, time[2]});

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(i -> distances[i]));
        queue.add(k - 1);
        distances[k - 1] = 0;

        while (!queue.isEmpty()) {
            Integer current = queue.poll();
            List<Integer[]> edges = adjList.get(current);
            for (Integer[] edge : edges) {
                int target = edge[0];
                if (distances[target] > distances[current] + edge[1]) {
                    distances[target] = distances[current] + edge[1];
                    queue.add(target);
                }
            }
        }
        int max = Arrays.stream(distances).max().getAsInt();
        return max == Integer.MAX_VALUE ? -1 : max;
    }
}


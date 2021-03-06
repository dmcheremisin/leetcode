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
//Constraints:
//1 <= k <= n <= 100
//1 <= times.length <= 6000
//times[i].length == 3
//1 <= ui, vi <= n
//ui != vi
//0 <= wi <= 100
//All the pairs (ui, vi) are unique. (i.e., no multiple edges.)

public class $0743NetworkDelayTimeBellmanFord {

    public int networkDelayTime(int[][] times, int n, int k) {
        int[] distances = new int[n];
        IntStream.range(0, n).forEach(i -> distances[i] = 101); // max weight constraint == 100

        distances[k - 1] = 0;
        for (int i = 0; i < n - 1; i++) {
            int counter = 0;
            for (int j = 0; j < times.length - 1; j++) {
                int source = times[j][0] - 1;
                int target = times[j][1] - 1;
                int weight = times[j][2];
                if (distances[target] > distances[source] + weight) {
                    distances[target] = distances[source] + weight;
                    counter++;
                }
            }
            if (counter == 0) break;
        }

        int max = Arrays.stream(distances).max().getAsInt();
        return max == 101 ? -1 : max;
    }
}


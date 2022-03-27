package org.train.leetcode;

// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of
// the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
//Notice that you may not slant the container.

public class $0011ContainerWithWater {

    public int maxArea(int[] height) {
        int max = 0;
        int a = 0;
        int b = height.length - 1;
        while(a < b) {
            int area = Math.min(height[a], height[b]) * (b - a);
            max = Math.max(area, max);
            if(height[a] < height[b]) a++;
            else b--;
        }
        return max;
    }
}

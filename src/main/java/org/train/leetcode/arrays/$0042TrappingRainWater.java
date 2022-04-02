package org.train.leetcode.arrays;

//Given n non-negative integers representing an elevation map where the width of each bar is 1,
// compute how much water it can trap after raining.

//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
// In this case, 6 units of rain water (blue section) are being trapped.

public class $0042TrappingRainWater {

    public static int trap(int[] height) {
        int maxLeft = 0, maxRight = 0;
        int left = 0, right = height.length - 1;
        int total = 0;

        while (left < right) {
            int hLeft = height[left], hRight = height[right];

            if (hLeft <= hRight) {
                if (hLeft < maxLeft)
                    total += maxLeft - hLeft;
                else
                    maxLeft = hLeft;

                left++;
            } else {
                if (hRight < maxRight)
                    total += maxRight - hRight;
                else
                    maxRight = hRight;

                right--;
            }
        }

        return total;
    }
}

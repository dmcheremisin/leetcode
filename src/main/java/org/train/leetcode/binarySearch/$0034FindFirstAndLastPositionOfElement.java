package org.train.leetcode.binarySearch;

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]

public class $0034FindFirstAndLastPositionOfElement {

    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if (len == 0)
            return new int[]{-1, -1};
        if (len == 1)
            return nums[0] == target ? new int[]{0, 0} : new int[]{-1, -1};

        int start = 0, end = len - 1;
        while (end - start > 1) {
            int mid = start + Math.max((end - start) / 2, 1);
            if (target < nums[mid]) {
                end = mid;
            } else if (target > nums[mid]) {
                start = mid;
            } else {
                start = end = mid;
                while (start - 1 >= 0 && nums[start - 1] == target)
                    start--;
                while (end < len - 1 && nums[end + 1] == target)
                    end++;
                return new int[]{start, end};
            }
        }

        if (nums[start] == target && nums[end] == target)
            return new int[]{start, end};
        if (nums[start] == target)
            return new int[]{start, start};
        if (nums[end] == target)
            return new int[]{end, end};

        return new int[]{-1, -1};
    }

}
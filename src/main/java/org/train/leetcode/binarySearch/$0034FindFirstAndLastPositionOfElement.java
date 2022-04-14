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
        if (len == 0) return new int[]{-1, -1};

        int start = 0, end = len - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = end = mid;
                while (start - 1 >= 0 && nums[start - 1] == target)
                    start--;
                while (end < len - 1 && nums[end + 1] == target)
                    end++;
                return new int[]{start, end};
            }
        }
        return new int[]{-1, -1};
    }

}
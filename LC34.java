//Leetcode 34: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Find the first occurrence of the target
        int first = findFirstOccurrence(nums, target);
        // Find the last occurrence of the target
        int last = findLastOccurrence(nums, target);
        // Return the indices as an array
        return new int[]{first, last};
    }

    private int findFirstOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pos = -1; // Position of the first occurrence

        while (start <= end) {
            // Calculate mid to prevent overflow
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                pos = mid;  // Update position
                end = mid - 1;  // Continue searching in the left half
            } else if (nums[mid] > target) {
                end = mid - 1;  // Search in the left half
            } else {
                start = mid + 1;  // Search in the right half
            }
        }
        return pos; // Return the position of the first occurrence
    }

    private int findLastOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pos = -1; // Position of the last occurrence

        while (start <= end) {
            // Calculate mid to prevent overflow
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                pos = mid;  // Update position
                start = mid + 1;  // Continue searching in the right half
            } else if (nums[mid] > target) {
                end = mid - 1;  // Search in the left half
            } else {
                start = mid + 1;  // Search in the right half
            }
        }
        return pos; // Return the position of the last occurrence
    }
}

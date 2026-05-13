/*
Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.
*/

class Solution {

    public int splitArray(int[] nums, int k) {

        int minPossibleSum = getMaxElement(nums);
        int maxPossibleSum = getArraySum(nums);

        while (minPossibleSum <= maxPossibleSum) {

            int currentLargestSum = minPossibleSum + (maxPossibleSum - minPossibleSum) / 2;

            int requiredSubarrays = countRequiredSubarrays(nums, currentLargestSum);

            if (requiredSubarrays <= k) {
                maxPossibleSum = currentLargestSum - 1;
            } else {
                minPossibleSum = currentLargestSum + 1;
            }
        }

        return minPossibleSum;
    }

    public static int getMaxElement(int[] nums) {

        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            maximum = Math.max(maximum, nums[i]);
        }

        return maximum;
    }

    public static int getArraySum(int[] nums) {

        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        return totalSum;
    }

    public static int countRequiredSubarrays(
            int[] nums,
            int allowedMaxSubarraySum) {

        int currentSubarraySum = 0;
        int subarrayCount = 1;

        for (int i = 0; i < nums.length; i++) {

            if (currentSubarraySum + nums[i] <= allowedMaxSubarraySum) {

                currentSubarraySum += nums[i];

            } else {

                subarrayCount++;
                currentSubarraySum = nums[i];
            }
        }

        return subarrayCount;
    }
}

// Same approach as binary subarray

// Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

// Return the number of nice sub-arrays.

// Example 1:

// Input: nums = [1,1,2,1,1], k = 3
// Output: 2
// Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return niceSubarray(nums, k) - niceSubarray(nums, k - 1);
    }

    public static int niceSubarray(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int count = 0;

        if (k < 0)
            return 0;

        for (int right = 0; right < nums.length; right++) {
            sum += (nums[right] % 2);

            while(sum>k){
                sum -= (nums[left]%2);
                left++;
            }

            count += (right-left+1);
            
        }
        return count;
    }
}

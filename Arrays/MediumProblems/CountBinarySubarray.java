class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return countBinarySubarray(nums, goal) - countBinarySubarray(nums, goal - 1);
    }

    public static int countBinarySubarray(int[] nums, int goal) {

        if (goal < 0)
            return 0;

        int left = 0;
        int count = 0;
        int sum = 0;
        int n = nums.length;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum > goal) {
                sum -= nums[left];
                left++;
            }
            count += (right - left + 1);

        }
        return count;
    }
}

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = maxValue(nums);
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (divisorValue(nums, mid) <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int maxValue(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }

    public static int divisorValue(int[] arr, int value) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += (int) Math.ceil((double) arr[i] / value);
        }
        return ans;
    }
}

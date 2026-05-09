class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int low = minValue(bloomDay);
        int high = maxValue(bloomDay);

        if ((long) m * k > n) {
            return -1;
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(bloomDay, mid, m, k, n)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int minValue(int[] arr) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.min(ans, arr[i]);
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

    public static boolean possible(int[] arr, int days, int m, int k, int n) {
        int count = 0;
        int boquets = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= days) {
                count++;
            } else {
                boquets += count / k;
                count = 0;
            }
        }
        boquets += count / k;
        if (boquets >= m) {
            return true;
        }
        return false;
    }

}

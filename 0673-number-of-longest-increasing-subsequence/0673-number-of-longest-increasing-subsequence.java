class Solution {
    public int findNumberOfLIS(int[] nums) {
    int n = nums.length;
        if (n == 0) return 0;

        int[] dp = new int[n];
        int[] count = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);

        int max = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j];
                    }
                }
            }
            max = Math.max(dp[i], max);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == max) {
                res += count[i];
            }
        }
        return res;
     
    }
}
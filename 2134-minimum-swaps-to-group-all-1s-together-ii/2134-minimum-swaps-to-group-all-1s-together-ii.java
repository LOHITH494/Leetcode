class Solution {
    public int minSwaps(int[] nums) {
        int count1 = 0;
        for (int val : nums) {
            if (val == 1) count1++;
        }

        int res = Integer.MAX_VALUE;
        int count0 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) count0++;
            if (i >= count1) {
                if (nums[i - count1] == 0) {
                    count0--;
                }
                res = Math.min(res, count0);
            }
        }

        for (int i = 0; i < count1; i++) {
            if (nums[i] == 0) count0++;
            if (nums[nums.length - count1 + i] == 0) count0--;
            res = Math.min(res, count0);
        }

        return res;
    }
}
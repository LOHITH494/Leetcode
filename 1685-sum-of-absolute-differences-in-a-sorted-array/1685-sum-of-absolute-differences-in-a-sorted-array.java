class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int totalSum = 0;
        for (int num : nums) 
        {
            totalSum += num;
        }
        int prefixSum = 0;
        for (int i = 0; i < n; i++) 
        {
            int leftSum = prefixSum;
            int rightSum = totalSum - prefixSum - nums[i];
            result[i] = (i * nums[i] - leftSum) + (rightSum - (n - i - 1) * nums[i]);
            prefixSum += nums[i];
        } 
        return result;
    }
}

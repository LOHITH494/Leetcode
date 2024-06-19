class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int max_sum=Integer.MIN_VALUE;
    int n=nums.length;
        for(int i=0;i<n-k+1;i++) 
        {
            int current_sum =0;
            for(int j=0;j<k;j++)
            {
                current_sum=current_sum+nums[i+j];
            }
            max_sum=Math.max(current_sum,max_sum);
        }
    return (double) max_sum/k;
    }
}
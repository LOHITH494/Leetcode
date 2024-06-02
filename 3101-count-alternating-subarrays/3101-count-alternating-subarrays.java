class Solution {
    public long countAlternatingSubarrays(int[] nums) {
    int n= nums.length;
    int dp[]=new int[n];
    long count=1;
    dp[0]=1;
    for(int i=1;i<n;i++)
    {
        if(nums[i]!=nums[i-1])
        {
            dp[i]=dp[i-1]+1;
        }
        else
        {
            dp[i]=1;
        }
        count+=dp[i];
    }
    return count;    
    }
}
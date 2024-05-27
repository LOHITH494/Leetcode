class Solution {
    public boolean canPartition(int[] nums) {
    int sum=0;
    for(int n:nums)
    {
        sum+=n;
    }    
    if(sum%2==1)
    {
        return false;
    }
    sum=sum/2;
    int dp[][]=new int[nums.length+1][sum+1];
    for(int i=0;i<=nums.length;i++) 
    {
        Arrays.fill(dp[i],-1); 
    }
    boolean ans=subset(nums,nums.length,sum,dp);
    return ans;
    }
    private boolean subset(int[] nums,int n,int sum,int[][] dp)
    {
        if(sum==0) 
        {
            return true;
        }
        if(n<=0) 
        {
            return false;
        }
        if(dp[n][sum]!=-1) 
        {
            if(dp[n][sum]==1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        boolean ans;
        if(nums[n-1]>sum)
        {
            ans=subset(nums,n-1,sum,dp);
        }
        else
        {
        boolean pick=subset(nums,n-1,sum-nums[n-1],dp);
        boolean npick=subset(nums,n-1,sum,dp);
        ans =pick||npick;
        }
    dp[n][sum]=ans?1:0;
    return ans;
    }
}
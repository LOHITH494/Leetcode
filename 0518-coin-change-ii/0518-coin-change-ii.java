class Solution {
    public int change(int amount, int[] coins) {
        int n =coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int i=0;i<=n;i++) 
        {
            for(int j=0;j<=amount;j++) 
            {
                dp[i][j]=-1;
            }
        }
        return subset(coins,n,amount,dp);
    }

    private int subset(int[] coins,int n,int amount,int[][] dp) {
        if(amount==0) 
        {
            return 1;
        }
        if(n==0) 
        {
            return 0;
        }
        if(dp[n][amount]!=-1) 
        {
            return dp[n][amount];
        }
        if(coins[n-1]>amount) 
        {
            dp[n][amount]=subset(coins,n-1,amount,dp);
        } 
        else 
        {
            int pick=subset(coins,n,amount-coins[n-1],dp);
            int notPick=subset(coins,n-1,amount,dp);
            dp[n][amount]=pick+notPick;
        }
        return dp[n][amount];
    }
}

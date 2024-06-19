class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m=obstacleGrid.length,n=obstacleGrid[0].length;
    int[] dp=new int[n];
    Arrays.fill(dp,1);
    for(int i=m-2;i>=0;i--)
    {
        for(int j=n-2;j>=0;j--)
        {
            if(obstacleGrid[i][j]==1)
            {
                continue;
            }
            else
            {
                dp[j]=dp[j]+dp[j+1];
            }
        }
    }
    return dp[0]/2;    
    }
}
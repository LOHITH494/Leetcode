class Solution {
    public int getMaximumGold(int[][] grid) {
    int max=0;
    for(int i=0;i<grid.length;i++)
    {
        for(int j=0;j<grid[i].length;j++)
        {
            max=Math.max(max,dfs(grid,i,j));
        }
    }
    return max;    
    }
    private int dfs(int grid[][],int i,int j)
    {
        if(i<0||j<0||i>grid.length-1||j>grid[i].length-1||grid[i][j]==0)
        {
            return 0;
        }
        int visited=grid[i][j];
        grid[i][j]=0;
        int up =dfs(grid,i-1,j);
        int down =dfs(grid,i+1,j);
        int left =dfs(grid,i,j-1);
        int right =dfs(grid,i,j+1);
        grid[i][j]=visited;
        return visited+Math.max(Math.max(up,down),Math.max(left,right));
    }
}
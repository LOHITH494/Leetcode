class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] vis = new boolean[rows][cols];
        
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    count++;
                    dfs(grid, i, j, vis);
                }
            }
        }
        return count;    
    }

    private void dfs(char[][] grid, int i, int j, boolean[][] vis) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0' || vis[i][j]) {
            return;
        }
        vis[i][j] = true;
        dfs(grid, i + 1, j, vis);
        dfs(grid, i - 1, j, vis);
        dfs(grid, i, j + 1, vis);
        dfs(grid, i, j - 1, vis);
    }
}
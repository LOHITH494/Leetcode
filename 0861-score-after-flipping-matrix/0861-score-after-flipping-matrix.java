class Solution {
    public int matrixScore(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) 
        {
            if (grid[i][0] == 0) 
            {
                flipRow(grid, i);
            }
        }
        for (int j = 1; j < cols; j++) 
        {
            int countOnes = 0;
            for (int i = 0; i < rows; i++) 
            {
                countOnes += grid[i][j];
            }
            if (countOnes < (rows + 1) / 2) 
            {
                flipColumn(grid, j);
            }
        }
        int score = 0;
        for (int i = 0; i < rows; i++) 
        {
            int rowValue = 0;
            for (int j = 0; j < cols; j++) 
            {
                rowValue = rowValue * 2 + grid[i][j];
            }
            score += rowValue;
        }
        return score;
    }
    private void flipRow(int[][] grid, int rowIndex) {
        for (int j = 0; j < grid[rowIndex].length; j++)
        {
            grid[rowIndex][j] = 1 - grid[rowIndex][j];
        }
    }
    private void flipColumn(int[][] grid, int colIndex) {
        for (int i = 0; i < grid.length; i++) 
        {
            grid[i][colIndex] = 1 - grid[i][colIndex];
        }
    }
}

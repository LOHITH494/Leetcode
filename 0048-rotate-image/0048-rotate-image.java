class Solution {
    public void rotate(int[][] matrix) {
    transpose(matrix);
    reverse(matrix);    
    }
    static void transpose(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr[i].length;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void reverse(int arr[][])
    {
        int n=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length/2;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = temp;
            }
        }
    }
}
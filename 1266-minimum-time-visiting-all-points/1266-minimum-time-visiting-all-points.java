class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
    int max=Integer.MIN_VALUE;
    for(int i=0;i<points.length;i++)
    {
        int x=points[i][0];
        int y=points[i][1];
        max=Math.max(max,x+y);
    } 
    return max;   
    }
}
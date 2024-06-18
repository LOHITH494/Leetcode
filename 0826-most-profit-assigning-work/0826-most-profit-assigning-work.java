class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
    int sum=0;
    for(int i=0;i<worker.length;i++)
    {
        int diff=0;
        for(int j=0;j<difficulty.length;j++)
        {
            if(difficulty[j]<=worker[i])
            {
                diff=Math.max(diff,profit[j]);
            }
        }
            sum+=diff;
        }
    return sum;         
    }
}
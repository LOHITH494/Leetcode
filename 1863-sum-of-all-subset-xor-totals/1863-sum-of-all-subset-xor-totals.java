class Solution {
    public int subsetXORSum(int[] nums) {
    int sum=0;
    for(int i=1;i<(1<<nums.length);i++)
    {
        int csum=0;
        for(int j=0;j<nums.length;j++)
        {
            if((i&(1<<j))!=0)
            {
                csum^=nums[j];
            }
        }
        sum+=csum;
    }
    return sum;    
    }
}
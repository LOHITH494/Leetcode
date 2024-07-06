class Solution {
    public int minOperations(int[] nums) {
    int idx=1,nidx=2,count=0;
    for(int i=0;i<=nums.length-3;i++)
    {
        if(nums[i]==0)
        {
            nums[i]=nums[i]^1;
            nums[idx]=nums[idx]^1;
            nums[nidx]=nums[nidx]^1;
            count++;
        }
        idx++;
        nidx++;
    }
    for(int n:nums)
    {
        if(n==0)
            return -1;
    }
    return count;
    }
}
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
    int res[]=new int[nums.length];
    int eidx=0,oidx=1;
    for(int i=0;i<nums.length;i++)
    {
        int rem=nums[i]&1;
        if(rem==0)
        {
            res[eidx]=nums[i];
            eidx+=2;
        }
        else
        {
            res[oidx]=nums[i];
            oidx+=2;
        }
    } 
    return res;   
    }
}
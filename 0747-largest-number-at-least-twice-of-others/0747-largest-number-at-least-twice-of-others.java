class Solution {
    public int dominantIndex(int[] nums) {
    int large=Integer.MIN_VALUE,idx=-1;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]>large)
        {
            large=nums[i];
            idx=i;
        }
    }    
    Arrays.sort(nums);
    return nums[nums.length-1]>=nums[nums.length-2]*2?idx:-1;
    }
}
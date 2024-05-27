class Solution {
    public int specialArray(int[] nums) {
    Arrays.sort(nums);
    for(int i=0;i<=nums.length;i++)
    {
        int idx=Arrays.binarySearch(nums,i);
        if(idx<0) 
        {
            idx=-(idx+1);
        }
        else 
        {
            while (idx>0 && nums[idx-1]>=i) 
            {
                idx--;
            }
        }
        int count=nums.length-idx;
        if (count==i) 
        {
            return i;
        }
    }
    return -1;    
    }
}
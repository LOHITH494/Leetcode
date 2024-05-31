class Solution {
    public int[] singleNumber(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    int res[]=new int[2];
    int idx=0;    
    for (int i = 0; i < n; i++) 
    {
            if (i == 0 && nums[i] != nums[i + 1]) 
            {
                res[idx++] = nums[i];
            } 
            else if (i == n - 1 && nums[i] != nums[i - 1]) 
            {
                res[idx++] = nums[i];
            } 
            else if (i > 0 && i < n - 1 && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) 
            {
                res[idx++] = nums[i];
            }
            if (idx == 2) 
            {
                break;
            }
        }
        return res;   
    }
}
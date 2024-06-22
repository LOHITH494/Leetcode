class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
    int count=0,res=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]%2!=0)
        {
            nums[i]=1;
        }
        else
        {
            nums[i]=0;
        }
    }
    HashMap<Integer, Integer> hm= new HashMap<>();
        hm.put(0,1);  
        int currentSum=0;
        int result = 0; 
        for (int num:nums) 
        {
            currentSum+=num;
            if (hm.containsKey(currentSum-k)) 
            {
                result+=hm.get(currentSum-k);
            }
            hm.put(currentSum,hm.getOrDefault(currentSum,0)+1);
        }       
        return result;
    }
}
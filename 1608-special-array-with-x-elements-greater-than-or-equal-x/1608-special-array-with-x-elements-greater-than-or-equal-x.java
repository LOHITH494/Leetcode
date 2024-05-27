class Solution {
    public int specialArray(int[] nums) {
        int x =nums.length;
        int[] count=new int[x+1]; 
        for(int elem:nums)
            if(elem>=x)
            {
                count[x]++;
            }
            else
            {
                count[elem]++; 
            }  
        int res=0;
        for(int i=count.length-1;i>0;i--) 
        {
            res+=count[i];
            if(res==i)
            {
                return i;
            }
        }    
        return -1;
    }
}

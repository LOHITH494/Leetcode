class Solution {
    public int minOperations(int[] nums) {
    int flip=0,count=0;
    for(int n:nums)
    {
        if(n==flip)
        {
            count++;
            if(flip==0)
            {
                flip=1;
            }
            else
            {
                flip=0;
            }
        }
    }    
    return count;
    }
}
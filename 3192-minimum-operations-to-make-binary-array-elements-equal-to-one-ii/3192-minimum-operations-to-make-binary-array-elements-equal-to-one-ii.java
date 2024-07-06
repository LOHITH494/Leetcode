class Solution {
    public int minOperations(int[] nums) {
    int flip=0;
    for(int n:nums)
    {
        flip+=1-n^flip&1;
    }    
    return flip;
    }
}
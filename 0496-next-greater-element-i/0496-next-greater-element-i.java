class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int idx=0;
    for(int n:nums1)
    {
       nums1[idx++]= next(n,nums2);
    }  
    return nums1;  
    }
    private int next(int n,int[] nums2)
    {
        boolean found=false;
        for(int i=0;i<nums2.length;i++)
        {
            if(nums2[i]==n)
            {
                found=true;
            }
            if(found && nums2[i]>n)
            {
                return nums2[i];
            }
        }
    return -1;
    }
}
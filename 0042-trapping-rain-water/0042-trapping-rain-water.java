class Solution {
    public int trap(int[] height) {
    int max=height[0];
    int res=height[0];
    if(height.length<=1)
    {
        return 0;
    }
    for(int i=1;i<height.length;i++)
    {
        if(height[i]>max)
        {
            max=height[i];
            res+=max;
        }
    } 
    return res;   
    }
}
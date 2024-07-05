class Solution {
    public int minCost(String colors, int[] neededTime) {
    char arr[]=colors.toCharArray();
    int max=0;
    int min=0;
    for(int i=1;i<colors.length();i++)
    {
        if(arr[i-1]==arr[i] && max==0)
        {
            min+=Math.min(neededTime[i-1],neededTime[i]);
            max=Math.max(neededTime[i-1],neededTime[i]);
        }
        else if(arr[i-1]==arr[i])
        {
            min+=Math.min(neededTime[i],max);
            max=Math.max(neededTime[i],max);
        }
        else
        {
            max=0;
        }
    }
    return min;    
    }
}
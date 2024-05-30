class Solution {
    public int countTriplets(int[] arr) {
    int n=arr.length;
    int res[]=new int[n+1];
    res[0]=0;
    for(int i=0;i<n;i++)
    {
        res[i+1]=res[i]^arr[i];
    }    
    int count=0;
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(res[i]==res[j+1])
            {
               count+=j-i;
            }
        }
    }
    return count;
    }
}
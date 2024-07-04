class Solution {
    public int[] shortestToChar(String s, char c) {
    int n=s.length();
    int arr1[]=new int[n];
    int idx=Integer.MAX_VALUE/2;
    for(int i=0;i<n;i++)
    {
        if(s.charAt(i)==c)
        {
            idx=0;
        }
        else
        {
            idx++;
        }
        arr1[i]=idx;
    }
    idx=Integer.MAX_VALUE/2;
    for(int i=n-1;i>=0;i--)
    {
        if(s.charAt(i)==c)
        {
            idx=0;
        }
        else
        {
            idx++;
        }
        arr1[i]=Math.min(arr1[i],idx);
    } 
    return arr1;
    }
}
class Solution {
    public int balancedStringSplit(String s) {
    int r=0,count=0;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='R')
        {
            r++;
        }
        else
        {
            r--;
        }
        if(r==0)
        {
            count++;
        }
    }
    return count;    
    }
}
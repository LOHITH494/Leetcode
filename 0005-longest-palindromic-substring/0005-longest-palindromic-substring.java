class Solution {
    public String longestPalindrome(String s) {
        int start=0,end=0,n=s.length();
        if(s.length()==0)
        {
            return "";
        }
        for(int i=0;i<n;i++)
        {
            int odd=palindrome(s,i,i);
            int even=palindrome(s,i,i+1);
            int length=Math.max(odd,even);
            if(length>end-start)
            {
                start=i-(length-1)/2;
                end=i+length/2;
            }
        }
        return s.substring(start,end+1);
    }
    static int palindrome(String s,int left,int right)
    {
        int l=left,r=right;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        return r-l-1;
    }
}
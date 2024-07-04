class Solution {
    public String makeSmallestPalindrome(String s) {
    char[] chars = s.toCharArray();
    int start=0,end=s.length()-1;
    while(start<end)
    {
        char a=chars[start],b=chars[end];
        if(a!=b)
        {
            if(a>b)
            {
                chars[start]=b;
            }
            else
            {
                chars[end]=a;
            }
        }
        start++;
        end--;
        
    }
    return new String(chars);   
    }
}
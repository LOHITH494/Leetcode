class Solution {
    public String reverseStr(String s, int k) {
    StringBuilder res=new StringBuilder();
    for(int i=0;i<s.length();i+=2*k)
    {
        int end=Math.min(i+k,s.length());
        StringBuilder sub=new StringBuilder(s.substring(i,end));
        res.append(sub.reverse());
        if (end<s.length()) 
        {
            int nextEnd = Math.min(i+2*k,s.length());
            res.append(s.substring(end,nextEnd));
        }
    }
    return res.toString();   
    }
}
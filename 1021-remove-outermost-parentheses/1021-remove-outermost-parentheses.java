class Solution {
    public String removeOuterParentheses(String s) {
    String st="";
    int count=0;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='(' && count++>0)
        {
            st+=s.charAt(i);
        }
        if(s.charAt(i)==')' && count-->1)
        {
            st+=s.charAt(i);
        }
    }
    return st;
    }    
}
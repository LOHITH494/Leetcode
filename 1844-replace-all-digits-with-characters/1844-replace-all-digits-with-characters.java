class Solution {
    public String replaceDigits(String s) {
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
        if(Character.isDigit(s.charAt(i)))
        {
            int n=s.charAt(i)-'0';
            char ch=(char)(s.charAt(i-1)+n);
            sb.append(ch);
        }
        else
        {
            sb.append(s.charAt(i));
        }
    }
    return sb.toString();    
    }
}
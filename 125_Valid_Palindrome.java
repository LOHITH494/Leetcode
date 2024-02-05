class Solution {
    public boolean isPalindrome(String s) {
    boolean out=false;
    s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String res="";
    for(int i=s.length()-1;i>=0;i--)
    {
        res=res+s.charAt(i);
    }
        out=s.equals(res);
return out;  
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    String first = strs[0];
    String last = strs[strs.length-1];
    String output = "";
    for(int i=0;i<first.length();i++)
    {
        if(first.charAt(i)==last.charAt(i))
        {
            output = output + first.charAt(i);
        }
        else
        {
            break;
        }
    }
    return output;    
    }
}

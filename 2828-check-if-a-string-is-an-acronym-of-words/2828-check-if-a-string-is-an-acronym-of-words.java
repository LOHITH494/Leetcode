class Solution {
    public boolean isAcronym(List<String> words, String s) {
    StringBuilder sb=new StringBuilder();
    for(String st:words)
    {
        sb.append(st.charAt(0));
    }
    String res=sb.toString();
    return s.equals(res);    
    }
}
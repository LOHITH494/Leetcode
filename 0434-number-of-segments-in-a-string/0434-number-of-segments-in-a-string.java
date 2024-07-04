class Solution {
    public int countSegments(String s) {
    if(s.trim().length()==0)   return 0;
    s=s.trim();
    s=s.replaceAll("\\s+"," ");
    String[] arr=s.split(" ");
    return arr.length;   
    }
}
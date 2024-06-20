class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
    String st[]=sentence.split(" ");
    int count=1;
    for(String s:st)
    {
        if(s.startsWith(searchWord))
        {
            return count;
        }
        count++;
    }
    return -1;    
    }
}
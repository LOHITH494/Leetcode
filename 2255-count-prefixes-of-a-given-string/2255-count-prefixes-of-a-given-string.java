class Solution {
    public int countPrefixes(String[] words, String s) {
    int count=0;
    for(String st:words)
    {
        if(s.startsWith(st))
        {
            count++;
        }
    }
    return count;    
    }
}
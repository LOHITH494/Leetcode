class Solution {
    public int countWords(String[] words1, String[] words2) {
    int count=0;
    HashMap<String,Integer> hm1=new HashMap<>();
    HashMap<String,Integer> hm2=new HashMap<>();
    for(String s:words1)
    {
        if(hm1.containsKey(s))
        {
            hm1.put(s,hm1.get(s)+1);
        }
        else
        {
            hm1.put(s,1);
        }
    }
    for(String s:words2)
    {
        if(hm2.containsKey(s))
        {
            hm2.put(s,hm2.get(s)+1);
        }
        else
        {
            hm2.put(s,1);
        }
    }
    for (String word : hm1.keySet()) 
    {
        if(hm1.get(word)==1&&hm2.getOrDefault(word,0)==1) 
        {
            count++;
        }
    }
    return count;
    }
}
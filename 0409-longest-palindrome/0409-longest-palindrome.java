class Solution {
    public int longestPalindrome(String s) {
    HashMap<Character,Integer> hm=new HashMap<>();
    int count=0;
    for(int i=0;i<s.length();i++)
    {
        if(hm.containsKey(s.charAt(i)))
        {
            hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
        }
        else
        {
            hm.put(s.charAt(i),1);
        }
    }
    boolean odd=false;
    for (Map.Entry<Character,Integer> entry:hm.entrySet()) 
    {
        int value = entry.getValue();
        if(value%2==0)
        {
            count+=value;
        }
        else
        {
            count+=value-1;
            odd=true;
        }
    }
    if(odd)
    {
        count++;
    } 
    return count;   
    }
}
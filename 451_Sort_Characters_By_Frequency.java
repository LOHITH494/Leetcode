import java.util.Arrays;
class Solution {
    public String frequencySort(String s) {
    Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) 
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }   
    PriorityQueue<Character> q = new PriorityQueue<>((x,y)->(map.get(y)-map.get(x)));
    for(char key:map.keySet())
    {
        q.add(key);
    }
    StringBuilder res=new StringBuilder();
    while(q.size()>0)
    {
        char c = q.poll();
        for(int i=0;i<map.get(c);i++)
        {
            res.append(c);
        }
    }
    return res.toString();
    }
}

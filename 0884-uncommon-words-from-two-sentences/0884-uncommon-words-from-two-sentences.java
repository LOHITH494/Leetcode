class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
    HashMap<String,Integer> hm=new HashMap<>();
    String[] arr1=s1.split(" ");
    String[] arr2=s2.split(" ");
    ArrayList<String> res=new ArrayList<>();
    for(String st1:arr1)
    {
        if(hm.containsKey(st1))
        {
            hm.put(st1,hm.get(st1)+1);
        }
        else
        {
            hm.put(st1,1);
        }
    }
    for(String st1:arr2)
    {
        if(hm.containsKey(st1))
        {
            hm.put(st1,hm.get(st1)+1);
        }
        else
        {
            hm.put(st1,1);
        }
    }
    for(Map.Entry<String,Integer> s:hm.entrySet()) 
    {
        if(s.getValue()==1)
        {
            res.add(s.getKey());
        }
    }
    return res.toArray(new String[0]);   
    }
}
class Solution {
    public int secondHighest(String s) {
    Set<Integer> res=new HashSet<>();
    for(int i=0;i<s.length();i++)
    {
        if(Character.isDigit(s.charAt(i)))
        {
            res.add((s.charAt(i)-'0'));
        }
    }
    if (res.size() < 2) 
    {
            return -1;
    }

    Integer[] resu = res.toArray(new Integer[0]);
    Arrays.sort(resu);
    return resu[resu.length - 2];
    }
}
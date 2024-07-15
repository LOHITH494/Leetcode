class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    List<Integer>[] bucket=new List[nums.length+1];
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int n:nums)
    {
        if(hm.containsKey(n))
        {
            hm.put(n,hm.get(n)+1);
        }
        else
        {
            hm.put(n,1);
        }
    }
    for(int key:hm.keySet())
    {
        int fre=hm.get(key);
        if(bucket[fre]==null)
        {
            bucket[fre]=new ArrayList<>();
        }
        bucket[fre].add(key);
    }
    int res[]=new int[k];
    int idx=0;
    for(int i=bucket.length-1;i>=0 && idx<k;i--)
    {
        if(bucket[i]!=null)
        {
            for(int n:bucket[i])
            {
                res[idx++]=n;
            }
        }
    }
    return res;
    }
}
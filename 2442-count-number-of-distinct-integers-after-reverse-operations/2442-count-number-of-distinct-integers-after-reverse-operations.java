class Solution {
    public int countDistinctIntegers(int[] nums) {
    HashSet<Integer> hs=new HashSet<>();
    for(int num:nums)
    {
        hs.add(num);
        hs.add(rev(num));
    }
    return hs.size();
    }
    static int rev(int n)
    {
        int res=0;
        while(n>0)
        {
            int rem=n%10;
            res=res*10+rem;
            n=n/10;
        }
        return res;
    }
}
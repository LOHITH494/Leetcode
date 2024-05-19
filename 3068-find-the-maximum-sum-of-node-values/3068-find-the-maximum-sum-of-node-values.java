class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
    long res=0,s1=0,s2=0;
    ArrayList<Integer> arr1=new ArrayList<>();
    ArrayList<Integer> arr2=new ArrayList<>();
    for(int num:nums)
    {
        int diff=(num^k)-num;
        if(diff>=0)
        {
            arr1.add(diff);
            s1+=num^k;
        }
        else
        {
            arr2.add(Math.abs(diff));
            s2+=num;
        }
    }
    Collections.sort(arr1);
    Collections.sort(arr2);
    if(arr1.size()%2==0)
    {
        return s1+s2;
    }
    if(arr2.size()>0)
    {
        return Math.max(s1+s2-arr1.get(0),s1+s2-arr2.get(0));
    }
    else
    {
        return s1+s2-arr1.get(0);
    }
    }
}
class Solution {
    public int[] decompressRLElist(int[] nums) {
    ArrayList<Integer> res=new ArrayList<>();
    for(int i=1;i<nums.length;i+=2)
    {
        int freq=nums[i-1];
        int val=nums[i];
        for(int j=0;j<freq;j++)
        {
            res.add(val);
        }
    }
    int[] arr=new int[res.size()];
    for(int i=0;i<res.size();i++)
    {
        arr[i]=res.get(i);
    }
    return arr;
    }
}
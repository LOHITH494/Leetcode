class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        arr.add(nums[i]);
        int sum=nums[i];
        for(int j=i+1;j<n;j++)
        {
            sum+=nums[j];
            arr.add(sum);
        }
    }
    Collections.sort(arr);
    int sum=0;
    for(int i=left-1;i<right;i++)
    {
        sum=(sum+arr.get(i))%(int)(1e9+7);
    } 
    return sum;   
    }
}
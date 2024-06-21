class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    ArrayList<Integer> res=new ArrayList<Integer>();
    Set<Integer> st=new HashSet<>();
    for(int i=0;i<nums.length;i++)
    {
        st.add(nums[i]);
    }
    for(int i=1;i<=nums.length;i++)
    {
        if(!st.contains(i))
        {
            res.add(i);
        }
    }
    return res;
}
}
class Solution {
    public String kthDistinct(String[] arr, int k) {
    int n=k;
    ArrayList<String> res=new ArrayList<>();
    for(String s:arr)
    {
        if(k>0 && !res.contains(s))
        {
            res.add(s);
        }
        else
        {
            if(k==0)
            {
                return s;
            }
            k--;
        }
    }  
    if(n==k)
    {
        return arr[0];
    }  
    return "";
    }
}
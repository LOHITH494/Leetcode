class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n =s.length();
        int[] cost =new int[n];
        for (int i=0;i<n;i++) 
        {
            cost[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }  
        int[] prefixSums = new int[n+1];
        for (int i=0;i<n;i++) 
        {
            prefixSums[i+1]=prefixSums[i]+cost[i];
        }   
        int maxLength=0; 
        for (int i=0;i<=n;i++) 
        {
            int low=i+1,high=n+1;
            while (low<high) 
            {
                int mid=low+(high-low)/2;
                if (prefixSums[mid]-prefixSums[i]<=maxCost) 
                {
                    low=mid+1;
                } 
                else 
                {
                    high=mid;
                }
            }
            maxLength = Math.max(maxLength,low-i-1);
        }
        
        return maxLength;
    }
}

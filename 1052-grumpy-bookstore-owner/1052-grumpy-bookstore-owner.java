class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int customer = 0;
        for(int i=0; i<grumpy.length; i++)
        {
            if(grumpy[i]==0)
            {
                customer+=customers[i];
            }
        }
        int maxExtra = 0;
        for(int i=0; i<=grumpy.length-minutes; i++)
        {
            int extra = 0;
            for(int j=i; j<i+minutes; j++)
            {
                if(grumpy[j]==1)
                {
                    extra+=customers[j];
                }
            }
            maxExtra = Math.max(maxExtra, extra);
        }
        return customer + maxExtra;    
    }
}
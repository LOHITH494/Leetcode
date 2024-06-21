class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
    int customer=0;
    for(int i=0;i<grumpy.length-minutes;i++)
    {
        if(grumpy[i]==0)
        {
            customer+=customers[i];
        }
    }
    for(int i=grumpy.length-minutes;i<grumpy.length;i++)
    {
        customer+=customers[i];
    }
    return customer;    
    }
}
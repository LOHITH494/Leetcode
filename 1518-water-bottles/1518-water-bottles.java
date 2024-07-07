class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
    int res=numBottles;
    int rem=numBottles;
    while(rem>=numExchange)
    {
        int new1 = rem/numExchange;
        res+=new1;
        rem=new1+rem%numExchange;    
    }
    return res;    
    }
}

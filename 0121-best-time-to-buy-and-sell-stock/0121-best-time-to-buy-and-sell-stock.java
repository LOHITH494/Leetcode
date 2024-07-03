class Solution {
    public int maxProfit(int[] prices) {
    int buy=0,sell=prices.length-1;
    int res=0;
    while(buy<sell)
    {
        if(prices[buy]>prices[buy+1])
        {
            buy++;
        }
        if(prices[sell]<prices[sell-1])
        {
            sell--;
        }
        else
        {
             res=Math.max(res,prices[sell]-prices[buy]);
             buy++;
             sell--;
        }
    }
    return res;   
    }
}
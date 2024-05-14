class Solution {
    public int arrangeCoins(int n) {
    int idx=1;
    int count=0;
    while(n>=idx)
    {
        n=n-idx;
        count++;
        idx++;
    }
    return count;    
    }
}
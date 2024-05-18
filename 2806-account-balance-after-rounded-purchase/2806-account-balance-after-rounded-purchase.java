class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
    int paid=((purchaseAmount+5)/10)*10;
    return 100-paid;    
    }
}
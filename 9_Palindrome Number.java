class Solution {
    public boolean isPalindrome(int x) {
        int actual=x;
        int reverse=0;
        while(x!=0 & x>0)
        {
            int remainder = x%10;
            reverse = reverse*10+remainder;
            x=x/10; 
        }
        return actual==reverse;
    }
}

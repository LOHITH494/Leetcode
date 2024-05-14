class Solution {
    public boolean checkPowersOfThree(int n) {
    while(n>=0)
    {
        int rem=0;
        if(n==0)
            return true;
        else
        {
            rem=n%3;
            if(rem==2)
            {
                return false;
            }
        }
        n=n/3;
    }  
    return false;  
    }
}
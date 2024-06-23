class Solution {
    public int minSwaps(String s) {
        int open = 0,close = 0,res = 0;
        for(char c:s.toCharArray()) 
        {
            if(c=='[') 
            {
                open++;
            }
            else 
            {
                if(open>0) 
                {
                    open--;
                } 
                else
                {
                    close++;
                }
            }
        }
        res =Math.max(open,close);
        return(res+1)/2;
    }
}
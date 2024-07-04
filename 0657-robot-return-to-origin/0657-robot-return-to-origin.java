class Solution {
    public boolean judgeCircle(String moves) {
    int up=0,left=0;
    for(int i=0;i<moves.length();i++)
    {
        if(moves.charAt(i)=='U')
        {
            up++;
        }
        if(moves.charAt(i)=='D')
        {
            up--;
        }
        if(moves.charAt(i)=='L')
        {
            left++;
        }
        if(moves.charAt(i)=='R')
        {
            left--;
        }
    }    
    return up==0 && left==0;
    }
}
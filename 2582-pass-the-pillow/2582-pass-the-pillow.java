class Solution {
    public int passThePillow(int n, int time) {
    int cycle=2*(n-1);
    time=time%cycle;
    int pos=0,dir=1;  
    for(int i=0;i<time;i++)    
    {
        pos+=dir;
        if(pos==0 || pos==n-1)
        {
            dir*=-1;
        }
    }
    return pos+1;
    }
}
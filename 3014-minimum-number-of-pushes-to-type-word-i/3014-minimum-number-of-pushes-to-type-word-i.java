class Solution {
    public int minimumPushes(String word) {
    int count=0;
    for(int i=0;i<word.length();i++)
    {
        if(i<8)
        {
            count++;
        }
        else if(i>7 && i<16)
        {
            count+=2;
        }
        else if(i>15 && i<24)
        {
            count+=3;
        }
        else
        {
            count+=4;
        }
    }
    return count;
    }
}
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
    int diff=coordinates[0][0]-coordinates[0][1];
    if(coordinates.length==1)
    {
        return true;
    }    
    for(int i=1;i<coordinates.length;i++)
    {
        if(coordinates[i][0]-coordinates[i][1]!=diff)
        {
            return false;
        }
    }
    return true;
    }
}
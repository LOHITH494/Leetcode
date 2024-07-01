class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
    int count=1;
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i-1]%2!=0&&arr[i]%2!=0)
        {
            count++;
            if(count==3)
            {
                return true;
            }
        }
        else
        {
            count=1;
        }
    }
    return false;    
    }
}
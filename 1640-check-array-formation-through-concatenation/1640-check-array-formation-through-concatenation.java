class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
    List<Integer> li=new ArrayList<>();
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<pieces.length;j++)
        {
            if(arr[i]==pieces[j][0])
            {
                for(int k=0;k<pieces[j].length;k++)
                {
                    li.add(pieces[j][k]);
                }
            }
        }
    }
        if(arr.length!=li.size())
        {
            return false;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=li.get(i))
            {
                return false;
            }
        }
    return true;
    }
}
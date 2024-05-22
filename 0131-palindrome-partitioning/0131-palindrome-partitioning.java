class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> path=new ArrayList<>();
        boolean[][] dp =new boolean[s.length()][s.length()];       
        for (int end=0;end<s.length();end++) {
            for (int start=0;start<=end;start++) {
                if (s.charAt(start)==s.charAt(end)&&(end-start<=2||dp[start+1][end-1]))
                {
                    dp[start][end]=true;
                }
            }
        }
        partition(s,0,ans,path,dp);
        return ans;
    } 
    private void partition(String s,int index,List<List<String>> ans,List<String> path, boolean[][] dp) 
    {
        if (index ==s.length()) 
        {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i=index;i<s.length();i++) {
            if (dp[index][i]) 
            {
                path.add(s.substring(index,i+1));
                partition(s,i+1,ans,path,dp);
                path.remove(path.size()-1);
            }
        }
    }
}
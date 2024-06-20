class Solution {
    public int minInsertions(String s) {
        int m=s.length();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        int n=rev.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=-1;
            }
        }
       int ans= lcs(s,rev,m,n,dp);
        return m-ans;
    }
    static int lcs(String s,String rev,int m,int n,int dp[][]){
        if(m==0||n==0){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];

        }
        if(s.charAt(m-1)==rev.charAt(n-1)){
            dp[m][n]=1+ lcs(s,rev,m-1,n-1,dp);
            return dp[m][n];
        }
        else{
            int ans1= lcs(s,rev,m-1,n,dp);
            int ans2= lcs(s,rev,m,n-1,dp);
            dp[m][n]= Math.max(ans1,ans2);
            return dp[m][n];
        }
    }
}
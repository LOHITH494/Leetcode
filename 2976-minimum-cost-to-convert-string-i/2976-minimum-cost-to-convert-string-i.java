class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {

        int dis[][] = new int[26][26];
        for(int i=0;i<26;i++){
            Arrays.fill(dis[i], Integer.MAX_VALUE);
            dis[i][i] = 0;
        }

        //basic filling of dis from given mapping
        for(int i=0;i<cost.length;i++){
            dis[original[i]-'a'][changed[i]-'a'] = Math.min(dis[original[i]-'a'][changed[i]-'a'], cost[i]);
        }

        for(int via=0;via<26;via++){
            for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                    if(dis[i][via]==Integer.MAX_VALUE || dis[via][j]==Integer.MAX_VALUE){
                        continue;
                    }
                    dis[i][j] = Math.min(dis[i][j], dis[i][via] + dis[via][j]);
                }
            }
        }

        long ans = 0;
        for(int i=0;i<source.length();i++){
            int from = source.charAt(i) - 'a';
            int to = target.charAt(i) - 'a';
            if(dis[from][to]==Integer.MAX_VALUE){
                return -1;
            }else{
                ans += (long)dis[from][to];
            }
        }
        return ans;
    }
}
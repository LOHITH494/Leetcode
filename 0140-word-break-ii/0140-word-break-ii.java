class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
    Set<String> wordSet=new HashSet<>(wordDict);
    Map<String,List<String>> memo=new HashMap<>();
        return Helper(s,wordSet,memo);
    }
    private List<String> Helper(String s,Set<String> wordDict,Map<String,List<String>> memo) {
        if (memo.containsKey(s)) 
        {
            return memo.get(s);
        }
        List<String> result=new ArrayList<>();
        if (s.length()==0) 
        {
            result.add("");
            return result;
        }
        for (String word : wordDict) 
        {
            if (s.startsWith(word)) 
            {
                String remaining=s.substring(word.length());
                List<String> subResult=Helper(remaining,wordDict,memo);
                for (String sub:subResult) 
                {
                    result.add(word+(sub.isEmpty()?"":" ")+sub);
                }
            }
        }
        memo.put(s,result);
        return result;    
    }
}
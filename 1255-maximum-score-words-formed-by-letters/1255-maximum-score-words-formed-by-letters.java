class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
    int[] letterCounts = new int[26];
        for (char letter :letters)
        {
            letterCounts[letter-'a']++;
        }
    return helper(words,0,letterCounts,score);
    }
    public static int helper(String[] words,int start,int[] letterCounts,int[] score)
    {
        if (start == words.length)
            return 0;
        int currScore =0;
        int wordScore =0;
        int[] nextCounts =letterCounts.clone();
        for (int i = 0;i<words[start].length();++i) 
        {
            int idx = words[start].charAt(i)-'a';
            if (nextCounts[idx]==0) 
            {
                wordScore =-1;
                break;
            }
            wordScore +=score[idx];
            nextCounts[idx]--;
        }
        if (wordScore>0)
        {
            currScore=helper(words,start+1,nextCounts,score)+wordScore;
        }
        currScore = Math.max(currScore,helper(words,start+1,letterCounts,score));
        return currScore;
    }    
}
class Solution {
    public List<String> commonChars(String[] words) {
        int wordsSize =words.length;
        int[] commonCharacterCounts =new int[26];
        Arrays.fill(commonCharacterCounts,Integer.MAX_VALUE);
        for (String word:words) 
        {
            int[] currentCharacterCounts=new int[26];
            for(char ch:word.toCharArray()) 
            {
                currentCharacterCounts[ch-'a']++;
            }
            for(int letter=0;letter<26;letter++) 
            {
                commonCharacterCounts[letter]=Math.min(commonCharacterCounts[letter], currentCharacterCounts[letter]);
            }
        }
        List<String> result=new ArrayList<>();
        for (int letter=0;letter<26;letter++) {
            for (int commonCount=0;commonCount<commonCharacterCounts[letter]; commonCount++)
            {
                result.add(String.valueOf((char) (letter + 'a')));
            }
        }
        return result;
    }
}
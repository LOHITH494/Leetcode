class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for (int i = 0; i < word.length(); i++) 
            arr[word.charAt(i) - 'a']++;
        Arrays.sort(arr); 
        int res = 0;
        for (int i = 0; i < 26; i++)
            res += (i / 8 + 1) * arr[25 - i];
        return res;
    }
}
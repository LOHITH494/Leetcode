class Solution {
    public String reverseVowels(String s) {
    if (s == null || s.length() == 0) 
    {
        return s;
    }

        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;
        char[] sArray = s.toCharArray();

        while (start < end) {
            while (start < end && vowels.indexOf(sArray[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(sArray[end]) == -1) {
                end--;
            }
            if (start < end) {
                char temp = sArray[start];
                sArray[start] = sArray[end];
                sArray[end] = temp;
                start++;
                end--;
            }
        }
        return new String(sArray);   
    }
}
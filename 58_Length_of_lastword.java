class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        char[] ch = s.toCharArray();
        String result = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] != ' ') {
                result = ch[i] + result;
            }
            else
            {
                break;
            }
        }
        return result.length();
    }
}

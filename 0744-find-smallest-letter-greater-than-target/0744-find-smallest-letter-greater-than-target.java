class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    char ch=letters[0];
    Arrays.sort(letters);
    for(int i=0;i<letters.length;i++)
    {
        if((int)letters[i]>(int)target)
        {
            return letters[i];
        }
    }    
    return ch;
    }
}
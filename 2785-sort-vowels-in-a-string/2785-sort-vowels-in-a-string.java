class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> arr=new ArrayList<>();
        int idx=0;
        char res[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if("AEIOUaeiou".indexOf(c) != -1)
            {
                arr.add(c);
            }
        }
        Collections.sort(arr);
         for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if("AEIOUaeiou".indexOf(c) != -1)
            {
                res[i]=arr.get(idx++);
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<res.length;i++)
        {
            sb.append(res[i]);
        }
        return sb.toString();
    }
}
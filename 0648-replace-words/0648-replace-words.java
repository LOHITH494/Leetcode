class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
    String arr[]=sentence.split(" ");
    for (int i=0; i<arr.length;i++) 
    {
        String word=arr[i];
        for(String prefix:dictionary) 
        {
            if(word.startsWith(prefix)) 
            {
                if(arr[i].equals(word)||prefix.length()<arr[i].length()) 
                {
                    arr[i]=prefix;
                }
            }
        }
    }
    StringBuilder sb=new StringBuilder();
    for(String s:arr)
    {
        sb.append(s+" ");
    }
    return sb.toString().trim();    
    }
}
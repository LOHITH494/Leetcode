import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
    StringBuilder sb=new StringBuilder();
    List<Integer> res=new ArrayList<>();
    for(int n:num)
    {
        sb.append(n);
    } 
    BigInteger sum = new BigInteger(sb.toString()).add(BigInteger.valueOf(k));
    String st=String.valueOf(sum);
    for(char ch:st.toCharArray())
    {
        res.add(ch-'0');
    }
    return res;
    }
}
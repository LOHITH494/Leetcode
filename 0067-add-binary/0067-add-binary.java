import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
    BigInteger n1=new BigInteger(a,2);
    BigInteger n2=new BigInteger(b,2); 
    n1=n1.add(n2);
    return n1.toString(2);   
    }
}
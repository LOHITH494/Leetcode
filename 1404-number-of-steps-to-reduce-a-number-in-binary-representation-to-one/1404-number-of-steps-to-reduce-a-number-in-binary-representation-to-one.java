import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
    int steps=0;
    BigInteger dec = new BigInteger(s, 2); 
    while (dec.compareTo(BigInteger.ONE) > 0) 
        {
            if (dec.mod(BigInteger.TWO).equals(BigInteger.ZERO)) 
            {
                dec = dec.divide(BigInteger.TWO);
            } 
            else 
            {
                dec = dec.add(BigInteger.ONE);
            }
            steps++;
        }
    return steps;    
    }
}
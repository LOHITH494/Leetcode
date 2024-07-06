class Solution {
    public int findComplement(int num) {
    String bin=Integer.toBinaryString(num);
    StringBuilder complement = new StringBuilder();
        for (char c : bin.toCharArray()) {
            complement.append(c == '0' ? '1' : '0');
        }
        return Integer.parseInt(complement.toString(), 2); 
    }
}
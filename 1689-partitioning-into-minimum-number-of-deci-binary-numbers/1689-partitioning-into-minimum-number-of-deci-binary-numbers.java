class Solution {
    public int minPartitions(String n) {
        char[] c = n.toCharArray();
        int max = 0;
        for(int i=0; i<c.length; i++) {
            if (max < c[i] - '0') {
                max = c[i] - '0';
            }
        }
        return max;
    }
}
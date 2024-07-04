class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> hs = new HashSet<>();
        for(int n:arr) 
        {
            if (hs.contains(n*2) || (n%2==0 && hs.contains(n/2))) {
                return true;
            }
            hs.add(n);
        }
        return false;
    }
}
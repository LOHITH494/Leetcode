class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        int totalSubsets = 0;
        Map<Integer,Integer> subsets=new HashMap<>();
        Integer[] numsArray =Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsArray,(a,b)->{
            int modComparison =Integer.compare(a%k,b%k);
            return modComparison!=0?modComparison:Integer.compare(a,b);
        });
        for (int num:numsArray) {
            int newSubsets = totalSubsets+1-subsets.getOrDefault(num-k,0);
            subsets.put(num,subsets.getOrDefault(num,0)+newSubsets);
            totalSubsets+=newSubsets;
        }
        return totalSubsets;
    }
}
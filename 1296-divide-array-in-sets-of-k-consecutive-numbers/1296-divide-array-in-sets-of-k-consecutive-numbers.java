class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int h : nums) {
            map.put(h, map.getOrDefault(h, 0) + 1);
        }
        if (nums.length % k != 0) {
            return false;
        }
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (freq == 0) continue;
            for (int i = 0; i < k; i++) {
                int curCard = key + i;
                int count = map.getOrDefault(curCard, 0);
                if (count < freq) {
                    return false;
                }
                map.put(curCard, count - freq);
            }
        }
        return true;
    }
}
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int item : nums)
        {
            tmp.add(item);
            map.put(item, map.getOrDefault(item, 0)+1);
        }

        Collections.sort(tmp, (ele1, ele2) -> (map.get(ele1) == map.get(ele2)) ? ele2 - ele1 : map.get(ele1) - map.get(ele2));
        int i=0;
        for(Integer item : tmp)
        {
            nums[i++] = item;
        }
        return nums;
    }
}
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                even.add(nums[i]);
            }
            else
            {
                odd.add(nums[i]);
            }
        }

        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        
        int idx = 0;
        int evenIdx = 0, oddIdx = 0;
        int evenSize = even.size(), oddSize = odd.size();

        while (evenIdx < evenSize && oddIdx < oddSize) {
            if (idx % 2 == 0) {
                nums[idx++] = even.get(evenIdx++);
            } else {
                nums[idx++] = odd.get(oddIdx++);
            }
        }

        while (evenIdx < evenSize) {
            nums[idx++] = even.get(evenIdx++);
        }
        
        while (oddIdx < oddSize) {
            nums[idx++] = odd.get(oddIdx++);
        }
        
        return nums;
    }
}

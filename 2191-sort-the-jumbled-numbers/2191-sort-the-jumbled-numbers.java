class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[][] ar = new int[nums.length][3];
        for(int i = 0 ; i<nums.length ; i++){
            int num = 0;
            ar[i][0] = nums[i];
            String k = nums[i]+"";
            for(char ch : k.toCharArray()){
                int r = mapping[ch-'0'];
                num = (num * 10) + r;
            }
            ar[i][1] = num;
            ar[i][2] = i;
        }
        Arrays.sort(ar , (a,b)->{
            if(a[1] == b[1])
            return a[2]-b[2];
            return a[1]-b[1];
        });
        for(int i = 0 ; i<nums.length ; i++){
            nums[i] = ar[i][0];
        }
        return nums;
    }
}
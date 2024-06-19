class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long totalFlowers = (long)m * k;
        if (totalFlowers > bloomDay.length) {
            return -1;
        }

        int minDay = Integer.MAX_VALUE, maxDay = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            minDay = Math.min(minDay, day);
            maxDay = Math.max(maxDay, day);
        }

        int low = minDay, high = maxDay;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canMakeBouquets(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canMakeBouquets(int[] bloomDay, int day, int m, int k) {
        int bouquets = 0, flowers = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
}

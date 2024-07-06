class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        int totalGarbageTime = 0;
        int lastGlass = 0, lastPaper = 0, lastMetal = 0;
        int[] travelTime = new int[n];
        for (int i = 1; i < n; i++) {
            travelTime[i] = travelTime[i - 1] + travel[i - 1];
        }

        for (int i = 0; i < n; i++) {
            String s = garbage[i];
            int glassCount = 0, paperCount = 0, metalCount = 0;
            for (char c : s.toCharArray()) {
                if (c == 'G')
                    glassCount++;
                if (c == 'P')
                    paperCount++;
                if (c == 'M')
                    metalCount++;
            }

            if (glassCount > 0)
                lastGlass = i;
            if (paperCount > 0)
                lastPaper = i;
            if (metalCount > 0)
                lastMetal = i;

            totalGarbageTime += glassCount + paperCount + metalCount;
        }

        if (lastGlass > 0)
            totalGarbageTime += travelTime[lastGlass];
        if (lastPaper > 0)
            totalGarbageTime += travelTime[lastPaper];
        if (lastMetal > 0)
            totalGarbageTime += travelTime[lastMetal];

        return totalGarbageTime;
    }
}

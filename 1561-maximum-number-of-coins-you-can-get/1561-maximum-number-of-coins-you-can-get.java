class Solution {
    public int maxCoins(int[] piles) {
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        int res=0;
        for (int pile:piles) 
        {
            tm.put(pile,tm.getOrDefault(pile,0)+1);
        }
        while (!tm.isEmpty()) 
        {
            int max=tm.lastKey();
            if (tm.get(max)==1) 
            {
                tm.remove(max);
            } 
            else 
            {
                tm.put(max,tm.get(max)-1);
            }
            if (tm.isEmpty()) 
            {
                break;
            }
            int secondMax=tm.lastKey();
            res += secondMax;
            if (tm.get(secondMax)==1) 
            {
                tm.remove(secondMax);
            } 
            else
            {
                tm.put(secondMax,tm.get(secondMax)-1);
            }
            if (tm.isEmpty()) 
            {
                break;
            }
            int min = tm.firstKey();
            if (tm.get(min)==1) 
            {
                tm.remove(min);
            } 
            else 
            {
                tm.put(min,tm.get(min)-1);
            }
        }
        return res;
    }
    }
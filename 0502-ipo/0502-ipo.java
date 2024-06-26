class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> minC = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> maxP = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < profits.length; i++) 
        {
            minC.offer(new int[]{capital[i], profits[i]});
        }
        while (k-- > 0) 
        {
            while (!minC.isEmpty() && minC.peek()[0] <= w) 
            {
                maxP.add(minC.poll()[1]);
            }
            if (maxP.isEmpty()) 
            {
                break;
            }
            w += maxP.poll();
        }
        return w;
    }
}
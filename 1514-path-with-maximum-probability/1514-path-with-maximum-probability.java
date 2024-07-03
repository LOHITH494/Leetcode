class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<double[]>[] adj = new List[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            adj[edges[i][0]].add(new double[]{edges[i][1], succProb[i]});
            adj[edges[i][1]].add(new double[]{edges[i][0], succProb[i]});
        }

        double[] dist = new double[n];
        Arrays.fill(dist, 0.0);
        dist[start] = 1.0;

        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[1], a[1]));
        pq.offer(new double[]{start, 1.0});

        while (!pq.isEmpty()) {
            double[] cur = pq.poll();
            int u = (int) cur[0];
            double prob = cur[1];
            if (prob < dist[u]) {
                continue;
            }
            for (double[] neighbor : adj[u]) {
                int v = (int) neighbor[0];
                double wt = neighbor[1];
                if (prob * wt > dist[v]) {
                    dist[v] = prob * wt;
                    pq.offer(new double[]{v, dist[v]});
                }
            }
        }

        return dist[end];
    }
}
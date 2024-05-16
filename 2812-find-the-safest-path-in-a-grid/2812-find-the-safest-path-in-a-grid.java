class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        if (grid.get(0).get(0) == 1 || grid.get(n - 1).get(n - 1) == 1) {
            return 0;
        }
        Deque<int[]> queue = new ArrayDeque<>();
        int[][] distances = new int[n][n];
        final int INF = 1 << 30;
        for (int[] distanceRow : distances) {
            Arrays.fill(distanceRow, INF);
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid.get(i).get(j) == 1) {
                    distances[i][j] = 0;
                    queue.offer(new int[] {i, j});
                }
            }
        }
        int[] directionDeltas = {-1, 0, 1, 0, -1};
        while (!queue.isEmpty()) {
            int[] position = queue.poll();
            int i = position[0], j = position[1];
            for (int k = 0; k < 4; ++k) {
                int x = i + directionDeltas[k], y = j + directionDeltas[k + 1];
                if (x >= 0 && x < n && y >= 0 && y < n && distances[x][y] == INF) {
                    distances[x][y] = distances[i][j] + 1;
                    queue.offer(new int[] {x, y});
                }
            }
        }
        List<int[]> sortedCellsByDistance = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                sortedCellsByDistance.add(new int[] {distances[i][j], i, j});
            }
        }
        sortedCellsByDistance.sort((a, b) -> Integer.compare(b[0], a[0])); 
        UnionFind unionFind = new UnionFind(n * n);
        for (int[] cell : sortedCellsByDistance) {
            int distance = cell[0], i = cell[1], j = cell[2];
            for (int k = 0; k < 4; ++k) {
                int x = i + directionDeltas[k], y = j + directionDeltas[k + 1];
                if (x >= 0 && x < n && y >= 0 && y < n && distances[x][y] >= distance) {
                    unionFind.union(i * n + j, x * n + y);
                }
            }
            if (unionFind.find(0) == unionFind.find(n * n - 1)) {
                return distance;
            }
        }
        return 0; 
    }
}
class UnionFind {
    private int[] parents;
    private int count;

    public UnionFind(int totalNodes) {
        parents = new int[totalNodes];
        for (int i = 0; i < totalNodes; ++i) {
            parents[i] = i; 
        }
        this.count = totalNodes;
    }

    public boolean union(int a, int b) {
        int parentA = find(a);
        int parentB = find(b);
        if (parentA == parentB) {
            return false;
        }
        parents[parentA] = parentB;
        --count;
        return true;
    }

    public int find(int x) {
        if (parents[x] != x) {
            parents[x] = find(parents[x]);
        }
        return parents[x];
    }
}
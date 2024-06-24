class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
     boolean[] vis = new boolean[rooms.size()];
        dfs(rooms, 0, vis);
        for (boolean v : vis) {
            if (!v) return false;
        }
        return true;
    }

    private void dfs(List<List<Integer>> rooms, int i, boolean[] vis) {
        if (vis[i]) return;
        vis[i] = true;
        for (int j : rooms.get(i)) {
            dfs(rooms, j, vis);
        }
    }
}
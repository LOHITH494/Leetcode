class Solution {
    private int result; 
    private int distance;
    
    public int countPairs(TreeNode root, int distance) {
        this.result = 0;
        this.distance = distance;
        dfs(root);
        return result;
    }

    private int[] dfs(TreeNode root) {
        int[] counts = new int[distance];

        if (root == null) {
            return counts;
        }

        if (root.left == null && root.right == null) {
            counts[0] = 1; // Count itself
            return counts;
        }

        int[] leftCounts = dfs(root.left);
        int[] rightCounts = dfs(root.right);

        for (int d1 = 0; d1 < distance; ++d1) {
            for (int d2 = 0; d1 + d2 + 2 <= distance; ++d2) {
                result += leftCounts[d1] * rightCounts[d2];
            }
        }

        for (int d = 1; d < distance; ++d) {
            counts[d] = leftCounts[d - 1] + rightCounts[d - 1];
        }

        return counts;
    }
}
class Solution {
    int count=0;
    public int distributeCoins(TreeNode root) {
        movecoins(root);
        return count;
    }
    private int movecoins(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=movecoins(root.left);
        int right=movecoins(root.right);
        count+=Math.abs(left)+Math.abs(right);
        return root.val+left+right-1;
    }
}
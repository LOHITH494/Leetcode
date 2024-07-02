class Solution {
    int maxLevel, maxSum;
    public int deepestLeavesSum(TreeNode root) {
        maxSum=0;
        maxLevel=-1;
        deepestLeavesSum(root,0);
        return maxSum;
    }

    private void deepestLeavesSum(TreeNode root,int level) {
        if(root==null) 
        {
            return;
        }
        if(level>maxLevel) 
        {
            maxLevel = level;
            maxSum = 0;
        }
        if(level==maxLevel && root.left==null && root.right==null) 
        {
            maxSum += root.val; 
        }
        deepestLeavesSum(root.left,level+1);
        deepestLeavesSum(root.right,level+1);
    }
}
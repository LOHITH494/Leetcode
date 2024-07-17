class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ansList = new ArrayList<>();
        int[] nodeCount = new int[1001];
        for(int nodeToDelete:to_delete)
        {
            nodeCount[nodeToDelete] = 1;
        }
        if(nodeCount[root.val]==0) ansList.add(root);
        helper(ansList,root,nodeCount);
        return ansList;
    }

    public boolean helper(List<TreeNode> ansList,TreeNode root,int[] nodeCount)
    {
        if(root==null) return false;
        if(helper(ansList,root.left,nodeCount))
        {
            root.left = null;
        }
        if(helper(ansList,root.right,nodeCount))
        {
            root.right = null;
        }

        if(nodeCount[root.val] == 1)
        {
            if(root.left!=null) ansList.add(root.left);
            if(root.right!=null) ansList.add(root.right);
            return true;
        }
        else{
            return false;
        }
    }
}
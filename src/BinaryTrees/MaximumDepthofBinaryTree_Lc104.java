package BinaryTrees;

public class MaximumDepthofBinaryTree_Lc104 {
    public int maxDepth(TreeNode root) {
        return findDepth(root);
    }

    private int findDepth(TreeNode root) {
        if(root==null) return 0;
//        return (1+Math.max(findDepth(root.left), findDepth(root.right)));
        int left=findDepth(root.left);
        int right=findDepth(root.right);
        int max=Math.max(left,right);
        return 1+max;
    }
}

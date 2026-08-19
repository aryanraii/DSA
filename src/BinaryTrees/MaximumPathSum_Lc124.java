package BinaryTrees;

public class MaximumPathSum_Lc124 {
    int sum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return sum;
    }

    private int maxSum(TreeNode root) {
        if(root==null) return 0;
        int left=maxSum(root.left);
        int right=maxSum(root.right);

        int leftSum=Math.max(0,left);
        int rightSum=Math.max(0,right);

        sum=Math.max(sum,leftSum+rightSum+root.val);

        //its return a valid path not include branch-->
        return Math.max(leftSum,rightSum)+root.val;
    }
}

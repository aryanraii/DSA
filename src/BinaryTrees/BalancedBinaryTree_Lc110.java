package BinaryTrees;

public class BalancedBinaryTree_Lc110 {
    public boolean isBalanced(TreeNode root) {
         return checkBalancedTree(root)!=-1;
    }

    private int checkBalancedTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=checkBalancedTree(root.left);
        if(left==-1){
            return -1;
        }
        int right=checkBalancedTree(root.right);
        if(right==-1) {
            return -1;
        }

        if(Math.abs(left-right)>1){
            return -1;
        }

        return Math.max(left,right)+1;
    }
}

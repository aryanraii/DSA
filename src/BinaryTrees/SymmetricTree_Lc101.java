package BinaryTrees;

public class SymmetricTree_Lc101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if(root.left==null && root.right==null) return true;
        if(root.left==null || root.right==null) return false;
        return checkSymmetric(root.left,root.right);
    }

    private boolean checkSymmetric(TreeNode node1, TreeNode node2) {
        if(node1==null && node2==null) return true;
        if(node1==null || node2==null) return false;
        if(node1.val==node2.val){
            return checkSymmetric(node1.left,node2.right)&&checkSymmetric(node1.right,node2.left);
        }
        return false;
    }
}

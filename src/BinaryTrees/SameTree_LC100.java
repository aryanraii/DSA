package BinaryTrees;

public class SameTree_LC100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return checkIdentical(p,q);
    }

    private boolean checkIdentical(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val==q.val){
            return checkIdentical(p.left,q.left)&&checkIdentical(p.right,q.right);
        }
        return false;
    }
}

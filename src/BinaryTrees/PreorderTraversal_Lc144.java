package BinaryTrees;
import java.util.ArrayList;
import java.util.List;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class PreorderTraversal_Lc144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        return preOrder(ans,root);
    }

    private List<Integer> preOrder(ArrayList<Integer> ans, TreeNode root) {
        if(root==null) return ans;
        ans.add(root.val);
        preOrder(ans,root.left);
        preOrder(ans,root.right);
        return ans;
    }
}

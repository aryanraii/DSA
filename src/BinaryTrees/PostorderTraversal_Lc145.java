package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal_Lc145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        return postOrder(root,ans);
    }

    private List<Integer> postOrder(TreeNode root, ArrayList<Integer> ans) {
        if(root==null) return ans;
        postOrder(root.left,ans);
        postOrder(root.right,ans);
        ans.add(root.val);
        return ans;
    }
}

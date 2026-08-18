package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal_Lc94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        return inOrder(root,ans);

    }

    private List<Integer> inOrder(TreeNode root, ArrayList<Integer> ans) {
        if(root==null) return ans;
        inOrder(root.left,ans);
        ans.add(root.val);
        inOrder(root.right,ans);
        return ans;
    }
}

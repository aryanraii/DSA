package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativePreorder_Lc144 {
    public List<Integer> preOrder(TreeNode root){
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(stack.size()>0){
            TreeNode node=stack.pop();
            ans.add(node.val);
            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
        return ans;
    }
}

package BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostorderTraversalUsingStack_Lc145 {
    //post order traversal-->using single stack
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> stack1=new Stack<>();
        stack1.push(root);
        while(stack1.size()>0){
            TreeNode top=stack1.pop();
            if(top.left!=null)stack1.push(top.left);
            if(top.right!=null)stack1.push(top.right);
            ans.add(top.val);
        }
        Collections.reverse(ans);
        return ans;
    }
    //postOrder using 2 Stack-->
//    public List<Integer> postorderTraversal(TreeNode root) {
//        if(root==null) return new ArrayList<>();
//        List<Integer> ans=new ArrayList<>();
//        Stack<TreeNode> stack1=new Stack<>();
//        Stack<TreeNode> stack2=new Stack<>();
//        stack1.push(root);
//        while(stack1.size()>0){
//            TreeNode top=stack1.pop();
//            if(top.left!=null)stack1.push(top.left);
//            if(top.right!=null)stack1.push(top.right);
//            stack2.push(top);
//        }
//        while(stack2.size()>0){
//            TreeNode top=stack2.pop();
//            ans.add(top.val);
//        }
//        return ans;
//    }
}

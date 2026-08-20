package BinaryTrees;

import java.util.*;

public class ZigzagLevelOrderTraversal_Lc103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int level=0;
        while(queue.size()>0){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node=queue.remove();
                list.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            if(level%2!=0){
                Collections.reverse(list);
            }
            res.add(list);
            level++;
        }
        return res;
    }
}

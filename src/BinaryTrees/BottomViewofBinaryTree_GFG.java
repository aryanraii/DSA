package BinaryTrees;

import java.util.*;

public class BottomViewofBinaryTree_GFG {
    class triplet{
        TreeNode node;
        int vertex;
        int level;
        triplet(TreeNode node,int vertex,int level){
            this.node = node;
            this.vertex = vertex;
            this.level = level;
        }
    }
    public ArrayList<Integer> bottomView(TreeNode root) {
        Queue<triplet> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        q.add(new triplet(root,0,0));
        while(q.size()>0){
            triplet front=q.remove();
            TreeNode node=front.node;
            int level=front.level;
            int vertex=front.vertex;
             map.put(vertex,node.val);
            if(node.left!=null) q.add(new triplet(node.left,vertex-1,level+1));
            if(node.right!=null) q.add(new triplet(node.right,vertex+1,level+1));
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}

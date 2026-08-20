package BinaryTrees;

import java.util.*;

public class TopViewofBinaryTree_GFG {
    class triplet{
        TreeNode node;
        int vertex;
        int level;
        triplet(TreeNode node,int vertex,int level){
            this.node=node;
            this.vertex=vertex;
            this.level=level;
        }
    }
    public ArrayList<Integer> topView(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Queue<triplet> q=new LinkedList<>();
        TreeMap<Integer,Integer>map=new TreeMap<>();
        q.add(new triplet(root,0,0));
        while(q.size()>0){
            triplet front=q.remove();
            TreeNode node=front.node;
            int level=front.level;
            int vertex=front.vertex;
            if(!map.containsKey(vertex)){
                map.put(vertex,node.val);
            }

            if(node.left!=null)q.add(new triplet(node.left,vertex-1,level+1));
            if(node.right!=null)q.add(new triplet(node.right,vertex+1,level+1));
        }
        for(int ele:map.values()){
            res.add(ele);
        }
        return res;
    }

}

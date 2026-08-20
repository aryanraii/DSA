package BinaryTrees;

import java.util.*;

public class VerticalOrderTraversalofBinaryTree_Lc987 {
    class triplet{
        TreeNode root;
        int vertical;
        int level;
        triplet(TreeNode root,int vertical,int level){
            this.root=root;
            this.vertical=vertical;
            this.level=level;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<triplet>q=new LinkedList<>();
        //TreeMap(vertical,TreeMap(level,list))-->
        TreeMap<Integer,TreeMap<Integer,List<Integer>>> map=new TreeMap<>();
        q.add(new triplet(root,0,0));
        while(q.size()>0){
            triplet front=q.remove();
            TreeNode node=front.root;
            int vertical=front.vertical;
            int level=front.level;
            if(!map.containsKey(vertical)){
                map.put(vertical,new TreeMap<>());
            }
            if(!map.get(vertical).containsKey(level)){
                map.get(vertical).put(level,new ArrayList<>());
            }
            map.get(vertical).get(level).add(node.val);
            if(node.left!=null){
                q.add(new triplet(node.left,vertical-1,level+1));
            }
            if(node.right!=null){
                q.add(new triplet(node.right,vertical+1,level+1));
            }
        }
        for(Map.Entry<Integer,TreeMap<Integer,List<Integer>>> entry:map.entrySet()){
            List<Integer> list=new ArrayList<>();
            for(Map.Entry<Integer,List<Integer>> entry1:entry.getValue().entrySet()){
                List<Integer> values=entry1.getValue();
                Collections.sort(values);
                list.addAll(values);
            }
            res.add(list);
        }
        return res;
    }

//    public List<List<Integer>> verticalTraversal(TreeNode root) {
//        List<List<Integer>> res=new ArrayList<>();
//        if(root==null) return res;
//        TreeMap<Integer,List<Integer>> map=new TreeMap<>();
//        traversal(0,root,map);
//        for(List<Integer> list:map.values()){
//            Collections.sort(list);
//            res.add(list);
//        }
//        return res;
//    }
//
//    private void traversal(int col, TreeNode root, TreeMap<Integer, List<Integer>> map) {
//        if(root==null) return;
//        if(!map.containsKey(col)){
//            List<Integer> list=new ArrayList<>();
//            list.add(root.val);
//            map.put(col,list);
//        }else{
//            List<Integer> list=map.get(col);
//            list.add(root.val);
//            map.put(col,list);
//        }
//        if(root.left!=null)traversal(col-1,root.left,map);
//        if(root.right!=null)traversal(col+1,root.right,map);
//    }

}

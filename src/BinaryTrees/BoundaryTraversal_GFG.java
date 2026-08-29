package BinaryTrees;

import java.util.ArrayList;

public class BoundaryTraversal_GFG {
    public ArrayList<Integer> boundaryTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        list.add(root.val);

        leftBoundary(root.left,list);

        bottomBoundary(root.left,list);
        bottomBoundary(root.right,list);

        rightBoundary(root.right,list);

        return list;
    }

    private void rightBoundary(TreeNode root, ArrayList<Integer> list) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        if(root.right!=null)rightBoundary(root.right,list);
        else rightBoundary(root.left,list);
        list.add(root.val);
    }

    private void bottomBoundary(TreeNode root, ArrayList<Integer> list) {
        if(root==null) return;
        if(root.left==null&&root.right==null){
            list.add(root.val);
            return;
        }
        bottomBoundary(root.left,list);
        bottomBoundary(root.right,list);
    }

    private void leftBoundary(TreeNode root, ArrayList<Integer> list) {
        if(root==null) return;
        if(root.left==null&&root.right==null)return;
        list.add(root.val);
        if(root.left!=null)  leftBoundary(root.left,list);
        else leftBoundary(root.right,list);
    }
}

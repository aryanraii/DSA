package BinaryTrees;

public class DiameterofBinaryTree_Lc543 {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDia(root);
        return diameter;
    }

    private int findDia(TreeNode left) {
        if(left==null) return 0;
        int leftDia=findDia(left.left);
        int rightDia=findDia(left.right);
        diameter=Math.max(diameter,leftDia+rightDia);
        return Math.max(leftDia,rightDia)+1;
    }

}

package Array;

import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

public class ConvertSortedArraytoBinarySearchTree_Lc108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(0, nums.length-1,nums);
    }
    private TreeNode helper(int si, int en,int[] nums){
        if(si>en) return null;
        int mid=si+(en-si)/2;
        TreeNode root=new TreeNode(nums[mid],null,null);
        root.left=helper(si,mid-1,nums);
        root.right=helper(mid+1,en,nums);
        return root;
    }
}

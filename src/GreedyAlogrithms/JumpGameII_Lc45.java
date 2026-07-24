package GreedyAlogrithms;

import java.util.Scanner;

public class JumpGameII_Lc45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ans=jump(nums);
        System.out.println(ans);
    }
    //TC-->O(n) Sc-->O(1)
    public static int jump(int[] nums) {
        int jumps=0;
        int left=0;
        int right=0;
        while(right<nums.length-1){
            int farthest=0;
            for(int i=left;i<=right;i++){
                farthest=Math.max(farthest,i+nums[i]);
            }
            left=right+1;
            right=farthest;
            jumps++;
        }
        return jumps;
    }

//    public static int jump(int[] nums) {
//        return helper(nums,0,0);
//    }
//
//    private static int helper(int[] nums, int idx,int count) {
//        if(idx>=nums.length-1){
//            return count;
//        }
//        int counter=Integer.MAX_VALUE;
//        for(int i=idx+1;i<=idx+nums[idx];i++){
//             counter=Math.min(counter,helper(nums,i,count+1));
//        }
//        return counter;
//    }
}

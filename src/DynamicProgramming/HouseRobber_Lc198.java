package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber_Lc198 {
    int[]dp;
    public int rob(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return findTotal(0,nums);
    }
    public int findTotal(int idx, int[]nums){
        if(idx>nums.length-1)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int rob=nums[idx]+findTotal(idx+2,nums);
        int notrob=findTotal(idx+1,nums);
        return dp[idx]=Math.max(rob,notrob);
    }
}

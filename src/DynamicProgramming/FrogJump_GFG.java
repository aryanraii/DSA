package DynamicProgramming;

import java.util.Arrays;

public class FrogJump_GFG {
    int[] dp;
    int minCost(int[] height) {
        // code here
        dp=new int[height.length];
        Arrays.fill(dp,-1);
        return findCost(height.length-1,height);
    }
    public int findCost(int i, int[]height){
        if(i==0)return 0;
        if(dp[i] != -1) {
            return dp[i];
        }
        int oneStepDiff=Math.abs(height[i]-height[i-1]);
        int oneStepJump=findCost(i-1, height)+oneStepDiff;
        int twoStepJump=Integer.MAX_VALUE;
        if(i>1){
            int twoDiff=Math.abs(height[i]-height[i-2]);
            twoStepJump=findCost(i-2,height)+twoDiff;
        }
        return dp[i]=Math.min(oneStepJump,twoStepJump);
    }
}

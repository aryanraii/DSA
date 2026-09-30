package DynamicProgramming;

import java.util.Arrays;

public class FrogjumpwithKdistances {
    int dp[];
    public int frogJump(int[] heights, int k) {
        dp=new int[heights.length];
        Arrays.fill(dp,-1);
        return findEnergy(0, heights,k);
    }
    public int findEnergy(int idx, int []heights, int k){
        if(idx==heights.length-1)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int minEnergy=Integer.MAX_VALUE;
        for(int i=1; i<=k; i++){
            if(idx+i<heights.length){
                int energy=Math.abs(heights[idx]-heights[idx+i]);
                int total=findEnergy(idx+i,heights,k)+energy;
                minEnergy=Math.min(total,minEnergy);
            }
        }
        return dp[idx]=minEnergy;
    }
}

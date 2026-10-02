package DynamicProgramming;

import java.util.HashMap;

public class FrogJump_Lc403 {
    HashMap<Integer,Integer> map=new HashMap<>();
    Boolean[][]dp;
    public boolean canCross(int[] stones) {
        dp=new Boolean[stones.length][2001];
        for(int i=0; i<stones.length; i++){
            map.put(stones[i],i);
        }
        return solve(stones, 0, 0);
    }
    public boolean solve(int[] stones, int currIndexStone, int prevJump){
        if(currIndexStone==stones.length-1)return true;
        if(dp[currIndexStone][prevJump]!=null) return dp[currIndexStone][prevJump];
        boolean result=false;
        for(int nextJump=prevJump-1; nextJump<=prevJump+1; nextJump++){
            if(nextJump>0){
                int nextStone=stones[currIndexStone]+nextJump;
                if(map.containsKey(nextStone)){
                    result=result||solve(stones, map.get(nextStone),nextJump);
                }
            }
        }
        return dp[currIndexStone][prevJump]=result;
    }
}

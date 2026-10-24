package DynamicProgramming;

import java.util.Arrays;
import java.util.List;

public class Triangle_Lc120 {
    int[][]dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        dp=new int[triangle.size()][triangle.size()];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        return solve(0,0,triangle,dp);
    }
    public int solve(int row, int col, List<List<Integer>> triangle,int[][]dp){
        if(row==triangle.size())return 0;
        if(dp[row][col]!=Integer.MAX_VALUE)return dp[row][col];
        int left=triangle.get(row).get(col)+solve(row+1,col,triangle,dp);
        int right=triangle.get(row).get(col)+solve(row+1,col+1,triangle,dp);
        return dp[row][col]=Math.min(left,right);
    }
}

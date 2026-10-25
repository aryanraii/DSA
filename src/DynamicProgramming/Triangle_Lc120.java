package DynamicProgramming;

import java.util.Arrays;
import java.util.List;

public class Triangle_Lc120 {
    //Tabulation with space optimisation-->
    public int minimumTotal(List<List<Integer>> triangle){
        int n=triangle.size();
        int front[]=new int[n];
        for(int i=0; i<n; i++){
            front[i]=triangle.get(n-1).get(i);
        }
        // int cur[]=new int[n];
        for(int i=n-2; i>=0; i--){
            int cur[]=new int[i+1];
            for(int j=i; j>=0; j--){
                int d=triangle.get(i).get(j)+front[j];
                int dg=triangle.get(i).get(j)+front[j+1];
                cur[j]=Math.min(d,dg);
            }
            front=cur;
        }
        return front[0];
    }

    //Tabulation-->
    // public int minimumTotal(List<List<Integer>> triangle){
    //     int n=triangle.size();
    //     int dp[][]=new int[n][n];
    //     for(int i=0; i<n; i++){
    //         dp[n-1][i]=triangle.get(n-1).get(i);
    //     }
    //     for(int i=n-2; i>=0; i--){
    //         for(int j=i; j>=0; j--){
    //             int d=triangle.get(i).get(j)+dp[i+1][j];
    //             int dg=triangle.get(i).get(j)+dp[i+1][j+1];
    //             dp[i][j]=Math.min(d,dg);
    //         }
    //     }
    //     return dp[0][0];
    // }

//    int[][]dp;
//    public int minimumTotal(List<List<Integer>> triangle) {
//        dp=new int[triangle.size()][triangle.size()];
//        for (int[] row : dp) {
//            Arrays.fill(row, Integer.MAX_VALUE);
//        }
//        return solve(0,0,triangle,dp);
//    }
//    public int solve(int row, int col, List<List<Integer>> triangle,int[][]dp){
//        if(row==triangle.size())return 0;
//        if(dp[row][col]!=Integer.MAX_VALUE)return dp[row][col];
//        int left=triangle.get(row).get(col)+solve(row+1,col,triangle,dp);
//        int right=triangle.get(row).get(col)+solve(row+1,col+1,triangle,dp);
//        return dp[row][col]=Math.min(left,right);
//    }
}

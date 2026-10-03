package DynamicProgramming;

public class UniquePathsII_Lc63 {
/// Tabulation-->
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][]dp=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }
                else if(i==0&&j==0){
                    dp[i][j]=1;
                }
                else{
                    int up=0;
                    int right=0;
                    if(i>0)up=dp[i-1][j];
                    if(j>0)right=dp[i][j-1];
                    dp[i][j]=up+right;
                }

            }
        }
        return  dp[m-1][n-1];
    }
///  Memoization-->
    // int dp[][];
    // public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //     int m=obstacleGrid.length;
    //     int n=obstacleGrid[0].length;
    //     dp=new int[m][n];
    //     for(int i=0; i<m; i++){
    //         for(int j=0; j<n; j++){
    //             dp[i][j]=-1;
    //         }
    //     }
    //     return solve(0,0,m,n,obstacleGrid);
    // }
    // public int solve(int row,int col, int m, int n,int[][] obstacleGrid){
    //     if(row==m-1&&col==n-1){
    //         if(obstacleGrid[row][col]==0)return 1;
    //         else return 0;
    //     }
    //     if(row>=m || col >=n)return 0;
    //     if(obstacleGrid[row][col]==1)return 0;
    //     if(dp[row][col]!=-1)return dp[row][col];
    //     int down=solve(row+1,col,m,n,obstacleGrid);
    //     int right=solve(row,col+1,m,n,obstacleGrid);
    //     return dp[row][col]=down+right;
    // }
}

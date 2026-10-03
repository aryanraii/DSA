package DynamicProgramming;

import java.util.Arrays;

public class NinjasTraining_GFG {

    ///Space optimisation-->
    public int ninjaTraining(int[][] matrix) {
        int n=matrix.length;
        int []prev=new int[4];
        prev[0]=Math.max(matrix[0][1],matrix[0][2]);
        prev[1]=Math.max(matrix[0][0],matrix[0][2]);
        prev[2]=Math.max(matrix[0][0],matrix[0][1]);
        prev[3]=Math.max(matrix[0][0],Math.max(matrix[0][1],matrix[0][2]));

        for(int day=1; day<n; day++){
            int []temp=new int[4];
            Arrays.fill(temp,0);
            for(int last=0;last<4; last++){
                temp[last]=0;
                for(int task=0; task<3; task++){
                    if(task!=last) {
                        temp[last] = Math.max(temp[last], matrix[day][task] + prev[task]);
                    }
                }
            }
            prev=temp;
        }
        return prev[3];
    }


    /// Tabulation-->
//    int [][]dp;
//    public int ninjaTraining(int[][] matrix) {
//        int n=matrix.length;
//        int [][]dp=new int[n][4];
//        dp[0][0]=Math.max(matrix[0][1],matrix[0][2]);
//        dp[0][1]=Math.max(matrix[0][0],matrix[0][2]);
//        dp[0][2]=Math.max(matrix[0][0],matrix[0][1]);
//        dp[0][3]=Math.max(matrix[0][0],Math.max(matrix[0][1],matrix[0][2]));
//
//        for(int day=1; day<n; day++){
//            for(int last=0;last<4; last++){
//                dp[day][last]=0;
//                for(int task=0; task<3; task++){
//                    if(task!=last){
//                        int point=matrix[day][task]+dp[day-1][task];
//                        dp[day][last]=Math.max(dp[day][last],point);
//                    }
//                }
//            }
//        }
//        return dp[n-1][3];
//    }


    ///  Memoization-->
//    int [][]dp;
//    public int ninjaTraining(int[][] matrix) {
//        int n=matrix.length;
//        dp=new int[n][4];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<4; j++){
//                dp[i][j]=-1;
//            }
//        }
//        // int total=0;
//        // int result=Integer.MIN_VALUE;
//        // for(int j=0; j<matrix[0].length; j++){
//        //     total=matrix[0][j]+solve(1,j,matrix);
//        //     result=Math.max(result,total);
//        // }
//        return solve(0,3,matrix);
//    }
//    public int solve(int row, int col, int[][]matrix){
//        if(row==matrix.length)return 0;
//        if(dp[row][col]!=-1)return dp[row][col];
//        int sum=0;
//        int maxSum=Integer.MIN_VALUE;
//        for(int k=0; k<matrix[0].length; k++){
//            if(k==col)continue;
//            sum=matrix[row][k]+solve(row+1,k,matrix);
//            maxSum=Math.max(maxSum,sum);
//        }
//        return dp[row][col]=maxSum;
//    }
}

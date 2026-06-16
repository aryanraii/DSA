package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_LC118 {
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        int dp[][]=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                if (i == j) dp[i][j] = 1;
                if (j == 0) dp[i][j] = 1;
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<i; j++){
                dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0; j<n; j++){
                if(dp[i][j]!=0)list.add(dp[i][j]);
            }
            ans.add(list);
        }
        return ans;
    }
}

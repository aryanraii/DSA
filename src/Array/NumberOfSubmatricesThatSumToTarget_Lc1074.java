package Array;

import java.util.HashMap;

public class NumberOfSubmatricesThatSumToTarget_Lc1074 {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int result=0;
        //cumulative sum row wise-->
        for(int row=0; row<m; row++){
            for(int col=1; col<n; col++){
                matrix[row][col]+=matrix[row][col-1];
            }
        }

        //Now , you need to find the No of subarray with sum==target(Leetcode 560)->Downward direction

        for(int startCol=0; startCol<n; startCol++){

            for(int j=startCol; j<n; j++){
                HashMap<Integer,Integer> map=new HashMap<>();
                map.put(0,1);
                int cumSum=0;
                for(int row=0; row<m; row++){
                    cumSum+=matrix[row][j]-(startCol>0 ? matrix[row][startCol-1] : 0);

                    int rem=cumSum-target;
                    if(map.containsKey(rem)){
                        result+=map.get(rem);
                    }

                    map.put(cumSum,map.getOrDefault(cumSum,0)+1);
                }
            }
        }

        return result;
    }
}

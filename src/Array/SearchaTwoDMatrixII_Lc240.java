package Array;

public class SearchaTwoDMatrixII_Lc240 {
    public boolean searchMatrix(int[][] matrix, int target) {
////    Time Complexity--> O(m+n);
        int m=matrix.length;
        int n=matrix[0].length;
        int row=0;
        int col=n-1;
        // we always start with always (row=0&&col= n-1) or (row=m-1&&col=0) so that reduce the posibility of searching
        while(row<m && col>=0){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}

package Array;

public class SearchAMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
////         Binary Search on total rows
////         Time Complexity-->O(log(m))  && total Time Complexity--> O(log(m*n));
         int m=matrix.length, n=matrix[0].length;
         int startRow=0;
         int endRow=m-1;
         while(startRow<=endRow){
             int midRow=startRow+(endRow-startRow)/2;
             if(target>=matrix[midRow][0]&&target<=matrix[midRow][n-1]){
                 //Found the row => Binary Search on this row
                 return searchInRow(matrix,target,midRow);
             }else if(target>matrix[midRow][n-1]){
                 startRow=midRow+1;
             }else{
                 endRow=midRow-1;
             }
         }
         return false;
    }

    private boolean searchInRow(int[][] matrix, int target, int midRow) {
////    Time Complexity-->O(log(n))
        int n=matrix[0].length;
        int startCol=0;
        int endCol=n-1;
        while(startCol<=endCol){
            int midCol=startCol+(endCol-startCol)/2;
            if(target>matrix[midRow][midCol]){
                startCol=midCol+1;
            }else if(target<matrix[midRow][midCol]){
                endCol=midCol-1;
            }else{
                return true;
            }
        }
        return false;
    }

////   Linear Search: Time Complexity-->O(n^2);
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int n=matrix.length;
//        int m=matrix[0].length;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(matrix[i][j]==target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}

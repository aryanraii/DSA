package Array;

public class SetMatrixZeroes_Lc73 {
    /// Time complexity-->O(N^2)
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

//        int row[]=new int[n];-->matrix[..][0]
//        int col[]=new int[m];-->matrix[0][..]
        int colO=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    //mark the ith row
                    matrix[i][0] = 0;
                    // mark the jth col
                    if(j!=0){
                        matrix[0][j] = 0;
                    }else{
                        colO=0;
                    }
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]!=0){
                    //check the col & row
                    if(matrix[0][j]==0 || matrix[i][0]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }

        if(matrix[0][0]==0){
            for(int j=0; j<m;j++) matrix[0][j]=0;
        }
        if(colO==0){
            for(int i=0; i<n; i++) matrix[i][0]=0;
        }
    }

    /// Time complexity-->O(2*N*M) and Space complexity-->O(N+M)
//    public void setZeroes(int[][] matrix) {
//        int n = matrix.length;
//        int m = matrix[0].length;
//
//        boolean[] rows = new boolean[n];
//        boolean[] cols = new boolean[m];
//
//        // Mark rows and columns containing 0
//        for (int i = 0; i < n; i++) {//tc-->O(n*m)
//            for (int j = 0; j < m; j++) {
//                if (matrix[i][j] == 0) {
//                    rows[i] = true;
//                    cols[j] = true;
//                }
//            }
//        }
//
//        // Set marked rows to 0 && overall for both rows and col TC-->O(n*m)
//        for (int i = 0; i < n; i++) {
//            if (rows[i]) {
//                for (int j = 0; j < m; j++) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//
//        // Set marked columns to 0
//        for (int j = 0; j < m; j++) {
//            if (cols[j]) {
//                for (int i = 0; i < n; i++) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//    }


    ///  Time complexity-->~O(N^3)
//    public void setZeroes(int[][] matrix) { // if all element is positive
//        int m = matrix.length;
//        int n = matrix[0].length;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (matrix[i][j] == 0) {
//                    markRow(i,matrix);
//                    markCol(j,matrix);
//                }
//            }
//        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(matrix[i][j] == -1){
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//    }
//
//    private void markCol(int j, int[][] matrix) {
//        for(int i=0;i<matrix.length;i++) {
//             if(matrix[i][j]!=0){
//                 matrix[i][j]=-1;
//             }
//        }
//    }
//
//    private void markRow(int i,int[][] matrix) {
//        for(int j=0; j<matrix[0].length;j++ ){
//            if(matrix[i][j]!=0){
//                matrix[i][j]=-1;
//            }
//        }
//    }



}

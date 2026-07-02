package Array;

public class RotateImage_Lc48 {

    //Time complexity-->O(n^2);
    public void rotate(int[][] matrix) {
        //Step1-->Transpose-->O(n/2 * n/2)
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Step2-->Reverse-->O(n * n/2)
        for(int i = 0; i < n; i++){
            int left=0; int right=m-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
